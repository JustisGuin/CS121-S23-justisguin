import java.awt.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public class espGame {
        public static void main(String[] args) {
            System.out.println("please guess a color");
            Scanner console = new Scanner(System.in);
            String player;
            Integer red = 0;
            Integer green = 1;
            Integer blue = 2;
            Integer orange = 3;
            Integer yellow = 4;

            for (int i = 0; i < 10; i++) {
                int randomInt = (int) (Math.random() * 4);

                System.out.println("Type 'q' if you want to end the game");
                player = console.nextLine();
                if (player.equals("q") ) {
                    System.out.println("Good one, genius.");
                    break;
                } if (player.equals("red") && randomInt == 0) {
                    System.out.println("Good job.");

                } if (player.equals("green") && randomInt == 1) {
                    System.out.println("Good job.");

                } if (player.equals("blue") && randomInt == 2) {
                    System.out.println("Good job.");

                } if (player.equals("orange") && randomInt == 3) {
                    System.out.println("Good job.");

                } if (player.equals("yellow") && randomInt == 4) {
                    System.out.println("Good job.");
                }
            }
        }
    }



    //ask for random number
    //assign that number to a color
    // then print that color with printf
}


