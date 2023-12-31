package Assignment04;

import java.util.ArrayList;
import java.util.Arrays;

public class LivingRoom extends Room{
    // Fields
    private boolean tv = false;
    Iterable<String> actions;
    private ArrayList<Room> neighbors;

    // Constructor
    public LivingRoom(String Name, Boolean Lighting){
        super(Name, Lighting);

        neighbors = new ArrayList<>();
        this.init();
    }

    // Methods
    public boolean getTV(){
        return this.tv;
    }

    public void init(){
        String[] actionsArray = new String[5];
        actionsArray[0] = "Switch TV";
        actionsArray[1] = "Switch Lighting";
        actionsArray[2] = "Play Home Theater System";
        actionsArray[3] = "Enter Neighboring Room";
        actionsArray[4] = "Leave Room";
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

    public void switchTV(){
        tv = !tv;

        if (tv){
            System.out.println("TV in the " + this.getName() + " is on \n");
        }
        else {
            System.out.println("TV in the " + this.getName() + " is off \n");
        }
    }

    public void playHomeTheaterSystem() throws InterruptedException {
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
        System.out.println("Never gonna tell a lie to hurt you\n");
    }

    @Override
    public void notifier(){
        if (this.getLighting()){
            System.out.println("Light is still on in the " + this.getName() + ", cannot leave apartment!");
        }
        if(this.getTV()){
            System.out.println("TV is still on in the " + this.getName() + ", cannot leave apartment!");
        }
    }

    @Override
    public boolean leaveChecks(){
        if(this.getLighting() || this.getTV()){
            return false;
        }
        return true;
    }

}
