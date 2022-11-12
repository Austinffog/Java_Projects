
package guess;

import java.util.Random;
import java.util.Scanner;


public class Guess {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = sc.next();

        System.out.println("Welcome to the game " + name);

        System.out.println("Would you like to start the game?");
        String answer = "Yes";

        System.out.println("You can only guess 5 times.");

        if (answer.equals("Yes")) {
            int x = new Random().nextInt(20)+1;

            for (int number = 1; number <= 20; number ++) {
                System.out.print("Guess a number from 1 to 20");
                number = sc.nextInt();
                if (number > x) {
                    System.out.print("Guess a smaller number.");
                    number = sc.nextInt();
                } if (number < x) {
                    System.out.print("Guess a higher number.");
                    number = sc.nextInt();
                } else {
                    System.out.println("Congrats you guessed the correct number.");
                }
            }
        }else {
            System.out.println("Play next time!");
        }

    }
    
}
