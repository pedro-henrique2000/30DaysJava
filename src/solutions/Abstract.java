package solutions;

import java.util.Scanner;

public class Abstract {

    public abstract class Book {
        String title;
        String author;

        Book(String titlee, String authorr) {
            title = titlee;
            author = authorr;
        }

        abstract void display();
    }

    class MyBook extends Book {

        int price;

        MyBook(String title, String author, int pricee) {
            super(title, author);
            price = pricee;
        }

        @Override
        void display() {
            String information = String.format("Title: %s%nAuthor: %s%nPrice: %d", title, author, price);

            System.out.println(information);
        }
    }

    public class Solution {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String title = scanner.nextLine();
            String author = scanner.nextLine();
            int price = scanner.nextInt();
            scanner.close();

            Book book = new MyBook(title, author, price);
            book.display();
        }
    }

}
