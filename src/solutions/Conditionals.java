package solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conditionals {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        if (isOdd(N))
            System.out.println("Weird");
        else if(!isOdd(N) && isBiggerThan2AndLowerThan5(N))
            System.out.println("Not Weird");
        else if (!isOdd(N) && biggerThan6LowerThan20(N))
            System.out.println("Weird");
        else
            System.out.println("Not Weird");

        bufferedReader.close();
    }

    private static boolean biggerThan6LowerThan20(int N) {
        return N >= 6 && N <= 20;
    }

    private static boolean isBiggerThan2AndLowerThan5(int N) {
        return N >= 2 && N <= 5;
    }

    private static boolean isOdd(int N) {
        return N % 2 != 0;
    }
}
