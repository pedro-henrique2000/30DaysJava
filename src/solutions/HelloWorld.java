package solutions;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        System.out.println("Hello, World.") ;
        System.out.println(s);
    }
}
