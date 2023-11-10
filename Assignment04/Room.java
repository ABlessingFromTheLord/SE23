package Assignment04;

public class Room {
    // Fields
    private String name;
    private boolean lighting;

    // Constructor
    public Room(String Name, boolean Lighting){
        this.name = Name;
        this.lighting = Lighting;
    }

    // Methods
    // Getters
    public String getName(){
        return this.name;
    }

    public void enter(){
        System.out.println("You are in the " + this.name);
    }

    public void switchLight(){
        lighting = !lighting;
    }
}
