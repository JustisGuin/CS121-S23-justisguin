import java.util.Scanner;
import java.util.Random;
public class PokemonBattle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter a odd number of rounds");
        int odd = console.nextInt();

        for (int i = 1; i <= odd; i++) {
            System.out.printf("It's round: s% ",i);

            System.out.println("Round 1\n----------");
            System.out.println("Player 1: Select a pokemon and enter its stats");

            //First player stats
            int player1Points = 0;

            System.out.println("Enter name:\n");
            String pokemonName = console.nextLine();

            System.out.println("Enter HP:\n");
            Integer pokemonHP = console.nextInt();

            System.out.println("Enter Move:\n");
            Integer pokemonMove = console.nextInt();

            System.out.println("Enter move's power");
            Integer pokemonPower = console.nextInt();

            System.out.println("Enter attack speed");
            Integer pokemonAttack = console.nextInt();

            //Player 2 stats
            System.out.println("Player 2: Select a Pokemon and enter its stats");

            System.out.println("Enter name:\n");
            String pokemonName2 = console.nextLine();

            System.out.println("Enter HP:\n");
            Integer pokemonHP2 = console.nextInt();

            System.out.println("Enter Move:\n");
            Integer pokemonMove2 = console.nextInt();

            System.out.println("Enter move's power");
            Integer pokemonPower2 = console.nextInt();

            System.out.println("Enter attack speed");
            Integer pokemonAttack2 = console.nextInt();


            //for i something < odd
            //Player 1
            if (pokemonHP >= 0 || pokemonHP2 >= 0) {
                if (pokemonAttack2 > pokemonAttack) {
                    pokemonHP = pokemonHP - pokemonPower2;
                }
                if (pokemonAttack2 < pokemonAttack) {
                    pokemonHP2 = pokemonHP2 - pokemonPower;
                }
                if (pokemonAttack2 == pokemonAttack) {
                    Random rand = new Random();
                    int upperbound = 2;
                    int int_random = rand.nextInt(upperbound);
                    if (int_random == 2) {
                        pokemonHP = pokemonHP - pokemonAttack2;
                    } else {
                        pokemonHP2 = pokemonHP2 - pokemonPower;
                    }

                }
            }
            int player1Wins = 0;
            int player2Wins = 0;
            if (pokemonHP <= 0) {
                System.out.println("Player 2 wins round " + i);
                player2Wins = player2Wins + 1;
            }
            if (pokemonHP2 <= 0) {
                System.out.println("Player 1 wins round " + i);
                player1Wins = player1Wins + 1;
            }
            if (player2Wins < player1Wins) {
                System.out.println("Player 1 wins! with " + player1Wins + " rounds");
            }
            if (player2Wins > player1Wins) {
                System.out.println("Player 2 wins! with " + player2Wins + " rounds");
            }

            //Player 2


        }
    }
}

