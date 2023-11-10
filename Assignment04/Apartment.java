package Assignment04;

import java.util.ArrayList;
import java.util.Stack;

public class Apartment {
    // Fields
    private String apartmentName;
    private Stack<Room> tour;
    private Room currentRoom;
    private ArrayList<Room> rooms;

    // Constructor
    public Apartment(String Name){
        rooms = new ArrayList<>();
        tour = new Stack<>();

        // Begin in hallway
        Room entrance = new Room("Hallway", false);
        rooms.add(entrance);
        currentRoom = entrance;
        tour.push(entrance);

        System.out.println("Welcome to" +  this.getApartmentName() + " apartment");
    }

    // Methods
    // Getters
    public String getApartmentName(){
        return this.apartmentName;
    }

    public void enter(){
        System.out.println("You are in the " + currentRoom);
        System.out.println("Choose an action: ");
    }

    public void leaveRoom(){
        System.out.println("You left the " +currentRoom.getName());
        tour.pop();
        currentRoom = tour.peek();
        this.enter();
    }

    public void addNewRoom(Room room){
        rooms.add(room);
    }

}
