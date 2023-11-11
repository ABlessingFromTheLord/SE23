package Assignment04;

import java.util.ArrayList;
import java.util.Arrays;

public class Room {
    // Fields
    private String name;
    private boolean lighting;
    Iterable<String> actions;
    private ArrayList<Room> neighbors;

    // Constructor
    public Room(String Name, boolean Lighting){
        this.name = Name;
        this.lighting = Lighting;

        neighbors = new ArrayList<>();
        this.init();
    }

    // Methods
    // Getters
    public String getName(){
        return this.name;
    }

    // Setters
    public void setNeighbors(Room room){
        this.neighbors.add(room);

        if(!room.neighbors.contains(this)){
            room.neighbors.add(this);
        }
    }

    public void init(){
        String[] actionsArray = new String[3];
        actionsArray[0] = "Switch Light";
        actionsArray[1] = "Enter Neighboring Room";
        actionsArray[2] = "Leave Room";
        actions = Arrays.asList(actionsArray);
    }

    public void enter(){
        System.out.println("You are in the " + this.name + "\n");
        System.out.println("Choose action from the following actions: ");

        int i = 1;
        for (String s: actions){
            System.out.println(i + " for " + s);
            i++;
        }
    }

    public void switchLight(){
        lighting = !lighting;
        if (lighting){
            System.out.println("Light in the " + this.getName() + " is on \n");
        }
        else {
            System.out.println("Light in the " + this.getName() + " is off \n");
        }
    }

    public void printNeighbors(){
        int i = 1;

        for (Room r: this.neighbors) {
            System.out.println(i + " for " + r.getName());
            i++;
        }
    }
}
