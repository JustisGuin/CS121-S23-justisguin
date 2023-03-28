import javax.swing.*;
import java.util.Random;
import java.util.Scanner;
public class Act7 {
    public static void main(String[] args) {
                Scanner console = new Scanner(System.in);
                String player;
                System.out.println("Please pick a number between 1-100");
                Random rand = new Random();
                int upperbound = 100;
                int int_random = rand.nextInt(upperbound);
                while (true) {

                    System.out.println("Type 'q' if you want to end the game");
                    player = console.nextLine();
                    if (player.equals("q") || Integer.valueOf(player) == int_random) {
                        System.out.println("Good one, genius.");
                        break;
                    } if (Integer.valueOf(player) < int_random) {
                        System.out.println("wrong, pick a different number");
                        System.out.println("Guess higher, numbnuts.");

                    } if (Integer.valueOf(player) > int_random) {
                        System.out.println("wrong, pick a different number");
                        System.out.println("Guess lower, numbnuts.");
                    }
                }


            }
        }

