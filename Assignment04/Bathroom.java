package Assignment04;

import java.util.ArrayList;
import java.util.Arrays;

public class Bathroom extends Room{
    // Fields
    private boolean shower = false;
    Iterable<String> actions;
    private ArrayList<Room> neighbors;

    // Constructor
    public Bathroom(String Name, Boolean Lighting){
        super(Name, Lighting);

        neighbors = new ArrayList<>();
        this.init();
    }

    // Methods
    public boolean getShower(){
        return this.shower;
    }

    public void init(){
        String[] actionsArray = new String[4];
        actionsArray[0] = "Switch Light";
        actionsArray[1] = "Switch Shower";
        actionsArray[2] = "Enter Neighboring Room";
        actionsArray[3] = "Leave Room";
        this.actions = Arrays.asList(actionsArray);
    }

    @Override
    public void enter(){
        System.out.println("You are in the " + this.getName() + "\n");
        System.out.println("Choose action from the following actions: ");

        int i = 1;
        for (String s: actions){
            System.out.println(i + " for " + s);
            i++;
        }
    }

    public void switchShower(){
        shower = !shower;

        if (shower){
            System.out.println("Shower in the " + this.getName() + " is on \n");
        }
        else {
            System.out.println("Shower in the " + this.getName() + " is off \n");
        }
    }

    @Override
    public void notifier(){
        if (this.getLighting()){
            System.out.println("Light is till on in the " + this.getName());
        }
        if(this.getShower()){
            System.out.println("Shower is still on in the " + this.getName());
        }
    }
}
