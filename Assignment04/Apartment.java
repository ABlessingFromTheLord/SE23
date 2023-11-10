package Assignment04;

import java.util.ArrayList;
import java.util.Stack;

public class Apartment {
    // Fields
    private Stack<Room> tour;
    private Room currentRoom;
    private ArrayList<Room> rooms;

    // Constructor
    public Apartment(){
        rooms = new ArrayList<>();
        tour = new Stack<>();

        // Begin in hallway
        System.out.println("You are in the Hallway");
    }

    // Methods
    public void enter(){
        System.out.println("You are in the");
    }

    public void addNewRoom(Room room){
        rooms.add(room);
    }
}
