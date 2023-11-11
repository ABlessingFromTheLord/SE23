package Assignment04;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class Kitchen extends Room{
    // Fields
    private boolean stove = false;
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
    public boolean getStove(){
        return this.stove;
    }

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
            System.out.println("Stove switched on\n");
            this.startTime = System.currentTimeMillis();
        }
        else{
            System.out.println("Stove switched off \n" + this.calcEnergy() + " Watts were consumed by stove\n");
        }
    }

    public double calcEnergy(){
        long endTime = System.currentTimeMillis() * 1000000;
        DecimalFormat df = new DecimalFormat("#.##");
        double duration = (endTime - this.startTime) / 3.6; // to get hours
        duration = Double.parseDouble(df.format(duration));
        return (2000 * duration);
    }

    @Override
    public void notifier(){
        if (this.getLighting()){
            System.out.println("Light is till on in the " + this.getName() + ", cannot leave apartment");
        }
        if(this.getStove()){
            System.out.println("Stove is still on in the " + this.getName() + ", cannot leave apartment");
        }
    }
}
