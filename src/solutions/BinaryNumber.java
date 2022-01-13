package solutions;

import java.io.IOException;

public class BinaryNumber {
    public static void main(String[] args) throws IOException {
        int consecutiveOnes = 0;
        int maxConsetive = 0;

        int n = 6;

        for (int i = n; i > 0; i /= 2) {
            if (i % 2 == 0) {
                maxConsetive = Math.max(maxConsetive, consecutiveOnes);
                consecutiveOnes = 0;
            }
            else
                consecutiveOnes++;
        }

        maxConsetive = Math.max(maxConsetive, consecutiveOnes);


        System.out.println(maxConsetive);

    }


}

