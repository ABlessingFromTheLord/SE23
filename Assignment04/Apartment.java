package Assignment04;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Apartment {
    // Fields
    private String apartmentName;
    private Stack<Room> tour;
    private Scanner sc;
    private Room currentRoom;
    private ArrayList<Room> rooms;

    // Constructor
    public Apartment(String Name){
        this.apartmentName = Name;
        rooms = new ArrayList<>();
        tour = new Stack<>();
        sc = new Scanner(System.in);

        // Begin in hallway
        Room entrance = new Room("Hallway", false);
        rooms.add(entrance);
        currentRoom = entrance;
        tour.push(entrance);

        System.out.println("Welcome to " +  this.getApartmentName() + " apartment!");
    }

    // Methods
    // Getters
    public String getApartmentName(){
        return this.apartmentName;
    }

    public void enter(){
        currentRoom.enter();
        this.readAction();
    }

    public void leaveRoom(){

        System.out.println("You left the " + currentRoom.getName());
        tour.pop();
        if (tour.empty()){
            System.out.println("You left the apartment");
        }
        else {
            currentRoom = tour.peek();
            this.enter();
        }
    }

    public void addNewRoom(Room room){
        rooms.add(room);
    }

    public void readAction(){
        while(true){
            if(sc.nextInt() == 1){
                this.currentRoom.switchLight();
                this.currentRoom.enter();
            }
            else if (sc.nextInt() == 2) {
                System.out.println("\n Choose from neighbors: ");
                this.currentRoom.printNeighbors();
            }
            else if (sc.nextInt() == 3) {
                this.leaveRoom();
            }
            else {
                break;
            }
        }
    }

}
