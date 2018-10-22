package asterisks;

import java.util.Random;
import java.util.Scanner;

public class Asterisks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, i, j;
        int rn;

        System.out.println("How many lines ");

        num = sc.nextInt();

        for (i = 0; i < num; i++) {
            Random randomObj = new Random();
           rn = randomObj.nextInt(10);

            for (j = 0; j < 10; j++) {

                if (j == rn) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println(" ");

        }
        System.out.println("End of our program");

    }

}
