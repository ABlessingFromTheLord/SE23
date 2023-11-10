package Assignment04;

import java.util.ArrayList;

public class Bathroom extends Room{
    // Fields
    private ArrayList<Room> neighbors;

    // Constructor
    public Bathroom(String Name, Boolean Lighting){
        super(Name, Lighting);

        neighbors = new ArrayList<>();
    }

    // Methods
    public boolean shower(){
    return false;
    }

    public void switchShower(){

    }
}
