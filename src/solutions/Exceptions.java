package solutions;

public class Exceptions {

    public static void main(String[] args) {
        String s = "123";

        try {
            System.out.println(Integer.parseInt(s));
        } catch (Exception e) {
            System.out.println("Bad String");
        }
    }

}
