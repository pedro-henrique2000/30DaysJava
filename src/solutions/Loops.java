package solutions;

import java.util.Random;

public class Loops {

    public static void main(String[] args) {

        int n = new Random().nextInt();

        for (int i = 1; i <= 10; i++)
            System.out.println(String.format("%d x %d = %d", n, i, n * i));


    }


}
