package Assignment04;

import java.util.ArrayList;
import java.util.Arrays;

public class LivingRoom extends Room{
    // Fields
    private String name;
    private boolean lighting;
    private boolean tv;
    Iterable<String> actions;
    private ArrayList<Room> neighbors;

    // Constructor
    public LivingRoom(String Name, Boolean Lighting){
        super(Name, Lighting);

        neighbors = new ArrayList<>();
        this.init();
    }

    // Methods
    public void init(){
        String[] actionsArray = new String[5];
        actionsArray[0] = "Switch TV";
        actionsArray[1] = "Switch Lighting";
        actionsArray[2] = "Play Home Theater System";
        actionsArray[3] = "Enter Neighboring Room";
        actionsArray[4] = "Leave Room";
        actions = Arrays.asList(actionsArray);
    }

    public void switchTV(){
        tv = !tv;
    }

    public void playHomeTheaterSystem() throws InterruptedException {
        System.out.println("Never gonna give you up");
        Thread.sleep(500);
        System.out.println("Never gonna let you down");
        Thread.sleep(500);
        System.out.println("Never gonna run around and desert you");
        Thread.sleep(500);
        System.out.println("Never gonna make you cry");
        Thread.sleep(500);
        System.out.println("Never gonna say goodbye");
        Thread.sleep(500);
        System.out.println("Never gonna tell a lie to hurt you");
    }
}
