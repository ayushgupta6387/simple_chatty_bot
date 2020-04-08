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
}
