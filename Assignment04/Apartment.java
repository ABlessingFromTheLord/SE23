package Assignment04;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Apartment {
    // Fields
    private String apartmentName;
    private Stack<Room> tour;
    private boolean inApartment = true;
    private boolean chooseRooms = false;
    private ArrayList<Room> roomChecks;
    private Scanner sc;
    private Room currentRoom;
    private ArrayList<Room> rooms;

    // Constructor
    public Apartment(String Name){
        this.apartmentName = Name;
        rooms = new ArrayList<>();
        tour = new Stack<>();
        roomChecks = new ArrayList<>();
        sc = new Scanner(System.in);

        System.out.println("Welcome to " +  this.getApartmentName() + " apartment!");
        System.out.println("HINT: The unique thing in this apartment is the home theater system\n");
    }

    // Methods
    // Getters
    public String getApartmentName(){
        return this.apartmentName;
    }

    public void enter() throws InterruptedException {
        // Begin in hallway
        for (Room r: this.rooms) {
            if (r.getName().equals("Hallway")){
                this.currentRoom = r;
                tour.push(r);
            }
        }

        currentRoom.enter();
        this.readAction();
    }

    public void enterRoom(Room room){
        this.currentRoom = room;
        this.tour.push(room);
        this.currentRoom.enter();
    }

    public void leaveRoom() throws InterruptedException {
        // Check if all room conditions are safe
        this.checkRoom(this.currentRoom);

        tour.pop();

        // leaving apartment
        if (tour.empty()){
            // cross-checking all conditions
            if(!roomChecks.isEmpty()){
                for (Room r: roomChecks) {
                    r.notifier();
                    System.out.println("\n");
                }
                enterRoom(this.currentRoom);
            }
            else{
                System.out.println("You left the Hallway.... and the apartment, Goodbye!");
                inApartment = false;
            }
        }
        // entering another room
        else {
            System.out.println("You left the " + currentRoom.getName() + "\n");
            this.currentRoom = tour.peek();
            this.currentRoom.enter();
        }
    }

    public void addNewRoom(Room room){
        this.rooms.add(room);
    }

    public void readAction() throws InterruptedException {
        while(inApartment){
            int input = sc.nextInt();

            if((this.currentRoom instanceof Room) && (this.currentRoom instanceof LivingRoom)) {
                // Actions for living room
                if(!chooseRooms)
                {
                    if(input == 1){
                        ((LivingRoom) this.currentRoom).switchTV();
                        this.currentRoom.enter();
                    }
                    else if (input == 2) {
                        this.currentRoom.switchLight();
                        this.currentRoom.enter();
                    }
                    else if (input == 3) {
                        ((LivingRoom) this.currentRoom).playHomeTheaterSystem();
                        this.currentRoom.enter();
                    }

                    else if (input == 4) {
                        System.out.println("\n Choose from neighbors: ");
                        chooseRooms = true;
                        this.currentRoom.printNeighbors();
                        this.readAction();
                    }
                    else if (input == 5) {
                        this.leaveRoom();
                    }
                    else {
                        System.out.println("Invalid input, please choose a number listed below");
                        this.readAction();
                    }
                }
                else {
                    this.enterRoom(this.currentRoom.getNeighbors().get(input -1));
                    chooseRooms = false;
                }


            }

            else if ((this.currentRoom instanceof Room) && (this.currentRoom instanceof Kitchen)) {
                // Actions for kitchen
                if(!chooseRooms){
                    if(input == 1){
                        this.currentRoom.switchLight();
                        this.currentRoom.enter();
                    }
                    else if (input == 2) {
                        ((Kitchen) this.currentRoom).switchStove();
                        this.currentRoom.enter();
                    }
                    else if (input == 3) {
                        System.out.println("\n Choose from neighbors: ");
                        chooseRooms = true;
                        this.currentRoom.printNeighbors();
                        this.readAction();
                    }
                    else if (input == 4) {
                        this.leaveRoom();
                    }
                    else{
                        System.out.println("Invalid input, please choose a number listed above");
                        this.readAction();
                    }
                }
                else{
                    this.enterRoom(this.currentRoom.getNeighbors().get(input -1));
                    chooseRooms = false;
                }

            }

            else if ((this.currentRoom instanceof Room) && (this.currentRoom instanceof Bathroom)) {
                // Actions for  Bathroom
                if(!chooseRooms){
                    if(input == 1){
                        this.currentRoom.switchLight();
                        this.currentRoom.enter();
                    }
                    else if (input == 2) {
                        ((Bathroom) this.currentRoom).switchShower();
                        this.currentRoom.enter();
                    }
                    else if (input == 3) {
                        System.out.println("\n Choose from neighbors: ");
                        chooseRooms = true;
                        this.currentRoom.printNeighbors();
                        this.readAction();
                    }
                    else if (input == 4) {
                        this.leaveRoom();
                    }
                    else{
                        System.out.println("Invalid input, please choose a number listed above");
                        this.readAction();
                    }
                }
                else{
                    this.enterRoom(this.currentRoom.getNeighbors().get(input -1));
                    chooseRooms = false;
                }
            }
            else
            {
                if(!chooseRooms){
                    // Actions for normal room
                    if(input == 1){
                        this.currentRoom.switchLight();
                        this.currentRoom.enter();
                    }
                    else if (input == 2) {
                        System.out.println("\n Choose from neighbors: ");
                        chooseRooms = true;
                        this.currentRoom.printNeighbors();
                        this.readAction();
                    }
                    else if (input == 3) {
                        this.leaveRoom();
                    }
                    else {
                        System.out.println("Invalid input, please choose a number listed above");
                        this.readAction();
                    }
                }
                else{
                    this.enterRoom(this.currentRoom.getNeighbors().get(input -1));
                    chooseRooms = false;
                }
            }
        }
    }

    public void checkRoom(Room room){
        if((room instanceof Room)&&(room instanceof LivingRoom)){
            // checks for living room
            if(!roomChecks.contains(room)){
                if (!room.leaveChecks()){
                    roomChecks.add(room);
                }
            }
            else{
                if(room.leaveChecks()){
                    roomChecks.remove(room);
                }
            }
        }
        else if ((room instanceof Room)&&(room instanceof Bathroom)) {
            // checks for bathroom
            if(!roomChecks.contains(room)){
                if (!room.leaveChecks()){
                    roomChecks.add(room);
                }
            }
            else{
                if(room.leaveChecks()){
                    roomChecks.remove(room);
                }
            }
        }
        else if ((room instanceof Room)&&(room instanceof Kitchen)) {
            // checks for kitchen
            if(!roomChecks.contains(room)){
                if (!room.leaveChecks()){
                    roomChecks.add(room);
                }
            }
            else{
                if(room.leaveChecks()){
                    roomChecks.remove(room);
                }
            }
        }
        else if (room instanceof Room) {
            // checks for room
            if(!roomChecks.contains(room)){
                if (!room.leaveChecks()){
                    roomChecks.add(room);
                }
            }
            else{
                if(room.leaveChecks()){
                    roomChecks.remove(room);
                }
            }
        }
        else {
            System.out.println("Room type is ambiguous");
        }
    }

}
