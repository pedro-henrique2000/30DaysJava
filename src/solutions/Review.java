package solutions;

import java.util.Arrays;
import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < cases; i++) {
            String s = scan.nextLine();
            char[] array = s.toCharArray();

            for (int j = 0; j < array.length; j+=2)
                System.out.print(array[j]);

            System.out.print(" ");

            for (int k = 1; k < array.length; k+=2)
                System.out.print(array[k]);

            System.out.println();


        }
    }
}
