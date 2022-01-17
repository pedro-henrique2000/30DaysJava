package solutions;

import java.util.Arrays;
import java.util.Scanner;

public class Inheritance {

    class Person {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        // Constructor
        Person(String firstName, String lastName, int identification){
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson(){
            System.out.println(
                    "Name: " + lastName + ", " + firstName
                            + 	"\nID: " + idNumber);
        }

    }

    class Student extends Person {
        private int[] testScores;


        public Student(String firstName, String secondName, int idNumber, int[] scores) {
            super(firstName, secondName, idNumber);
            this.testScores = scores;
        }

        public char calculate() {
            int average = Arrays.stream(testScores).sum() / testScores.length;

            char grade = getStudentFinalGrade(average);

            return grade;
        }

        private char getStudentFinalGrade(int average) {

            if (average >= 90 && average <= 100)
                return 'O';

            if (average >= 80 && average < 90)
                return 'E';

            if (average >= 70 && average < 80)
                return 'A';

            if (average >= 55 && average < 70)
                return 'P';

            if (average >= 40 && average < 55)
                return 'D';

            return 'T';
        }
    }

    class Solution {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String firstName = scan.next();
            String lastName = scan.next();
            int id = scan.nextInt();
            int numScores = scan.nextInt();
            int[] testScores = new int[numScores];
            for(int i = 0; i < numScores; i++){
                testScores[i] = scan.nextInt();
            }
            scan.close();

//            Student s = new Student(firstName, lastName, id, testScores);
//            s.printPerson();
//            System.out.println("Grade: " + s.calculate() );
        }
    }
}
