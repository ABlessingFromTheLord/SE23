package Assignment03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int max = 1000;
        int factor = 623;
        int increment = 525;
        int start = 157;
        int actualRandom;

        while (true) {
            // Version 1 cannot be implemented because we lack of control features
            // such as branching, loops or goto statement to result of evaluated conditions

            System.out.println("Random seed the generator? (y/n)");
            Scanner sc = new Scanner(System.in);
            char c = sc.next().charAt(0);

            // Version 2
            /*
            //random number is generated using user specified seed value
            if(c == 'y' || c == 'Y'){
                System.out.println("Please put in a seed value: ");
                int temp = sc1.nextInt();
                actualRandom = ((factor * temp) + increment) % max;
                System.out.println("Random number: " + actualRandom);
            }*/

            /*
            // Version 3
            if (c == 'y' ||c == 'Y'){
                System.out.println("Please put in a seed value: ");
                int temp = sc.nextInt();

                actualRandom = ADO.getActualRandom(temp);
                System.out.println("Random number: " + actualRandom);
            }*/

            // Version 4


            else{ break; }

        }
    }
}
