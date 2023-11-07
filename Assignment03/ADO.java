package Assignment03;
import java.util.Date;

public class ADO {
    // Fields
    private static int max = 1000;
    private static int factor = 623;
    private static int increment = 525;
    private static int start = 157;

    // Constructor
    public ADO(){

    }


    // Methods
    public static <actualRandom> int getActualRandom(int seed){
        return (((factor * seed) + increment) % max);
    }
}
