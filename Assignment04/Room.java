package Assignment04;

import java.util.Arrays;
import java.util.Scanner;

public class Room {
    // Fields
    private String name;
    private boolean lighting;
    private Scanner sc;
    Iterable<String> actions;

    // Constructor
    public Room(String Name, boolean Lighting){
        this.name = Name;
        this.lighting = Lighting;

        sc = new Scanner(System.in);
        this.init();
    }

    // Methods
    // Getters
    public String getName(){
        return this.name;
    }

    public void init(){
        String[] actionsArray = new String[3];
        actionsArray[0] = "Switch Light";
        actionsArray[1] = "Enter neighboring room";
        actionsArray[2] = "leave room";
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
    }

    public void readAction(){
        if(sc.nextInt() == 0){

        }
    }
}
