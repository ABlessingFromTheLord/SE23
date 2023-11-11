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
        actions = Arrays.asList(actionsArray);
    }

    public void switchStove(){
        stove = !stove;

        if(stove){
            this.startTime = System.currentTimeMillis();
        }
        else{
            System.out.println(this.calcEnergy() + " Watts were consumed by stove");
        }
    }

    public double calcEnergy(){
        long endTime = System.currentTimeMillis();
        long duration = (endTime - this.startTime) / 3600000; // to get hours
        return (2000 * duration);
    }
}
