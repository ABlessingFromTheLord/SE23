package Assignment04;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Apartment {
    // Fields
    private String apartmentName;
    private Stack<Room> tour;
    private boolean inApartment = true;
    private boolean chooseRooms= false;
    private Scanner sc;
    private Room currentRoom;
    private ArrayList<Room> rooms;

    // Constructor
    public Apartment(String Name){
        this.apartmentName = Name;
        rooms = new ArrayList<>();
        tour = new Stack<>();
        sc = new Scanner(System.in);

        System.out.println("Welcome to " +  this.getApartmentName() + " apartment!");
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
                currentRoom = r;
                tour.push(r);
            }
        }

        currentRoom.enter();
        this.readAction();
    }

    public void leaveRoom() throws InterruptedException {

        System.out.println("You left the " + currentRoom.getName());
        tour.pop();

        if (tour.empty()){
            System.out.println(".... and the apartment, Goodbye!");
            inApartment = false;
        }
        else {
            currentRoom = tour.peek();
            this.enter();
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
                    }
                    else if (input == 2) {
                        this.currentRoom.switchLight();
                    }
                    else if (input == 3) {
                        ((LivingRoom) this.currentRoom).playHomeTheaterSystem();
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

                }


            }

            else if ((this.currentRoom instanceof Room) && (this.currentRoom instanceof Kitchen)) {
                // Actions for kitchen
                if(input == 1){
                    this.currentRoom.switchLight();
                }
                else if (input == 2) {
                    ((Kitchen) this.currentRoom).switchStove();
                }
                else if (input == 3) {
                    System.out.println("\n Choose from neighbors: ");
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

            else if ((this.currentRoom instanceof Room) && (this.currentRoom instanceof Bathroom)) {
                // Actions for  Bathroom
                if(input == 1){
                    this.currentRoom.switchLight();
                }
                else if (input == 2) {
                    ((Bathroom) this.currentRoom).switchShower();
                }
                else if (input == 3) {
                    System.out.println("\n Choose from neighbors: ");
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
            else
            {
                // Actions for normal room
                if(input == 1){
                    this.currentRoom.switchLight();
                    this.currentRoom.enter();
                }
                else if (input == 2) {
                    System.out.println("\n Choose from neighbors: ");
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
        }
    }

}
