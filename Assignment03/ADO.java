package Assignment03;

public class ADO {
    // Fields
    private static int max = 1000;
    private static int factor = 623;
    private static int increment = 525;
    private static int start = 157;
    private static int actualRandom = ((factor * start) + increment) % max;


    // Methods
    public static <actualRandom> int getActualRandom(int actualRandom){
        actualRandom = (((factor * actualRandom) + increment) % max);
        return actualRandom;
    }

    public static int getPredefinedRandom(){
        actualRandom = (((factor * actualRandom) + increment) % max);
        return actualRandom;
    }
}
