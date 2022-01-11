package solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arrays {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        List<Integer> integerList = arr.subList(0, arr.size());

        Collections.reverse(integerList);

        integerList.forEach(i -> System.out.print(i + " "));


    }
}
