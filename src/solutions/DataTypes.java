package solutions;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int integer = scan.nextInt();
        double decimal = scan.nextDouble();
        scan.nextLine();
        String string = scan.nextLine();

        scan.close();

        System.out.println(integer + i);
        System.out.println(decimal + d);
        System.out.println(s.concat(string));
    }
}
