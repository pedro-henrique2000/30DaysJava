package solutions;

import java.util.Arrays;

public class Scope {

    public static int computeDifference(int[] arr) {

        int[] ints = Arrays.copyOf(arr, arr.length);

        Arrays.sort(ints);

        int maximumDifference  = ints[ints.length - 1] - ints[0];

        return maximumDifference;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5};
        int i = computeDifference(arr);

        System.out.println(i);
    }

}
