package Assignment04;

import java.util.ArrayList;

public class Bathroom extends Room{
    // Fields
    private boolean shower;
    private ArrayList<Room> neighbors;

    // Constructor
    public Bathroom(String Name, Boolean Lighting){
        super(Name, Lighting);

        neighbors = new ArrayList<>();
    }

    // Methods

    public void switchShower(){
        shower = !shower;
    }
}
