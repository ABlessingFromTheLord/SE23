package Assignment04;

import java.util.ArrayList;

public class Apartment {
    // Fields
    private ArrayList<Room> rooms;

    // Constructor
    public Apartment(){
        rooms = new ArrayList<>();
    }

    // Methods
    public void enter(){

    }

    public void addNewRoom(Room room){
        rooms.add(room);
    }
}
