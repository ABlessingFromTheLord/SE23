package Assignment03;

import java.util.Date;

public class ADT {
    private static int max = 1000;
    private static int factor = 623;
    private static int increment = 525;
    private static int start = 157;
    private static Date date = new Date();
    private static int time = (int)date.getTime() / 10;


    public ADT(){

    }

    public static int getActualRandom1(int seed){
        return (((factor * seed) + increment) % max);
    }

    public static int getActualRandom2(int seed){
        return (((factor * seed) + time) % max);
    }
}
