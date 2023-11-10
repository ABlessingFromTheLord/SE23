package Assignment04;

import java.util.ArrayList;

public class Kitchen extends Room{
    // Fields
    private boolean stove;
    private ArrayList<Room> neighbors;
    private long startTime;

    // Constructor
    public Kitchen(String Name, boolean Lighting){
        super(Name, Lighting);

        neighbors = new ArrayList<>();
    }

    // Methods
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
