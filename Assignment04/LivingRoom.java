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
        actionsArray[0] = "Switch tv";
        actionsArray[1] = "Switch lighting";
        actionsArray[2] = "Play Home theater music";
        actionsArray[3] = "Enter neighboring room";
        actionsArray[4] = "Leave room";
        actions = Arrays.asList(actionsArray);
    }

    public void enter(){
        int i = 1;
        for (String s: actions){
            System.out.println(i + " for " + s);
            i++;
        }
    }

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
