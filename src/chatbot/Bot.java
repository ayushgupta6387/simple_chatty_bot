package chatbot;

import java.util.Scanner;

public class Bot {
    Scanner scanner = new Scanner(System.in);

    public void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    public void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    public void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    public void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    public void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Scanner class of which package?");
        System.out.println("1. java.lang package");
        System.out.println("2. java.io");
        System.out.println("3. java.util");
        System.out.println("4. java.applet");
    }

    public void end() {
        int answer = scanner.nextInt();
        if (answer == 1 || answer == 2 || answer == 4) {
            System.out.println("Please, try again.");
        } else {
            System.out.println("Congratulations, have a nice day!");
        }
    }

}
