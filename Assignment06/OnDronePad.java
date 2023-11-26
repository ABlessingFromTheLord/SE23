package Assignment06;

import java.util.Arrays;

public class OnDronePad extends State{
    // Fields
    Iterable<String> commands;


    // Constructor
    public OnDronePad(){

    }

    // Methods
    @Override
    public void init(){
        String[] actionsArray = new String[4];
        actionsArray[0] = "Activate Drone";
        actionsArray[1] = "Deactivate Drone";
        this.commands = Arrays.asList(actionsArray);
    }

    public void enterState(){
        System.out.println("Possible inputs: \n");

        int i = 1;
        for (String s: commands){
            System.out.println(i + " for " + s);
            i++;
        }
    }

}
