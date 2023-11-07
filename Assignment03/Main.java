package Assignment03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int max = 1000;
        int factor = 623;
        int increment = 525;
        int start = 157;
        int actualRandom = 0, randTemp = 0;
        boolean executed = false;

        while (true) {
            if(executed){
                randTemp = actualRandom;
            }

            // Version 1 cannot be implemented because we lack of control features
            // such as branching, loops or goto statement to result of evaluated conditions

            System.out.println("Random seed the generator? (y/n)");
            Scanner sc = new Scanner(System.in);
            char c = sc.next().charAt(0);

            /*
            // Version 2
            //random number is generated using user specified seed value
            if(c == 'y' || c == 'Y'){
                System.out.println("Please put in a seed value: ");
                int temp = sc.nextInt() + randTemp;
                actualRandom = ((factor * temp) + increment) % max;
                System.out.println("Random number: " + actualRandom);
                executed = true;
            }*/


            /*
            // Version 3
            if (c == 'y' ||c == 'Y'){
                System.out.println("Please put in a seed value: ");
                int temp = sc.nextInt() + randTemp;

                actualRandom = ADO.getActualRandom(temp);
                System.out.println("Random number: " + actualRandom);
                executed = true;
            }*/


            // Version 4
            if (c == 'y' || c == 'Y'){
                System.out.println("Please put two seed values, seperated by space: ");
                int temp1 = sc.nextInt() + randTemp;
                int temp2 = sc.nextInt() + randTemp^2;
                actualRandom = Math.abs(ADT.getActualRandom1(temp1));
                System.out.println("Random numbers: " +  actualRandom + ", " + Math.abs(ADT.getActualRandom2(temp2)));
                executed = true;
            }

            else{ break; }

        }
    }
}
