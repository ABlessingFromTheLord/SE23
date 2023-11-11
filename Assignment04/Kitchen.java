package Assignment04;

import java.util.ArrayList;
import java.util.Arrays;

public class Kitchen extends Room{
    // Fields
    private boolean stove;
    private ArrayList<Room> neighbors;
    Iterable<String> actions;
    private long startTime;

    // Constructor
    public Kitchen(String Name, boolean Lighting){
        super(Name, Lighting);

        neighbors = new ArrayList<>();
        this.init();
    }

    // Methods
    public void init(){
        String[] actionsArray = new String[4];
        actionsArray[0] = "Switch Light";
        actionsArray[1] = "Switch Stove";
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

    public void switchStove(){
        stove = !stove;

        if(stove){
            System.out.println("Stove switched on");
            this.startTime = System.currentTimeMillis();
        }
        else{
            System.out.println("Stove switched off \n" + this.calcEnergy() + " Watts were consumed by stove");
        }
    }

    public double calcEnergy(){
        long endTime = System.currentTimeMillis() * 1000000;
        double duration = (endTime - this.startTime) / 3.6; // to get hours
        return (2000 * duration);
    }
}
