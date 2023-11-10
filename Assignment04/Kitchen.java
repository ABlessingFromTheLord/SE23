package Assignment04;

import java.util.ArrayList;

public class Kitchen extends Room{
    // Fields
    private ArrayList<Room> neighbors;

    // Constructor
    public Kitchen(String Name, boolean Lighting){
        super(Name, Lighting);

        neighbors = new ArrayList<>();
    }

    // Methods
    public boolean stove(){

        return false;
    }

    public void switchStove(){

    }
}
