package bot;

import java.util.Scanner;

public class SimpleBot {

    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        greet("Aid", "2018"); // change it as you need
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.printf("What a great name you have, %s!%n", name);
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        boolean correctAnswer = false;
        String question = "Why do we use methods?";
        String answer1 = "1. To repeat a statement multiple times.";
        String answer2 = "2. To decompose a program into several small subroutines.";
        String answer3 = "3. To determine the execution time of a program.";
        String answer4 = "4. To interrupt the execution of a program.";


        System.out.println("Let's test your programming knowledge.");
        System.out.println(question);
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
        System.out.println(answer4);
        Scanner scanner = new Scanner(System.in);
        while (!correctAnswer) {
            String userAnswer = scanner.nextLine();
            if (userAnswer.equals("2")) {
                correctAnswer = true;
            } else {
                System.out.println("Please, try again");
            }
        }
    }


    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
