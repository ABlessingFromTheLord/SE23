package Assignment04;

import java.util.ArrayList;

public class LivingRoom extends Room{
    // Fields
    private boolean tv;
    private ArrayList<Room> neighbors;

    // Constructor
    public LivingRoom(String Name, Boolean Lighting){
        super(Name, Lighting);

        neighbors = new ArrayList<>();
    }

    // Methods
    public void switchTV(){
        tv = !tv;
    }

    public void playHomeTheaterMusic() throws InterruptedException {
        System.out.println("Never gonna give you up");
        Thread.sleep(1000);
        System.out.println("Never gonna let you down");
        Thread.sleep(1000);
        System.out.println("Never gonna run around and desert you");
        Thread.sleep(1000);
        System.out.println("Never gonna make you cry");
        Thread.sleep(1000);
        System.out.println("Never gonna say goodbye");
        Thread.sleep(1000);
        System.out.println("Never gonna tell a lie to hurt you");
    }
}
