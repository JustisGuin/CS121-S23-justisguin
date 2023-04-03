import java.util.Scanner;
//Used Ben's/Alex's Code for help 
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("How many players are there? ");
            final int n = scanner.nextInt();
                Player[] players = new Player[n];
            for (int i = 0; i < n; i++) {
                players[i] = new Player();
            }

            PokemonSelection pokemonSelection = new PokemonSelection();
            pokemonSelection.assignPokemon(players);
        }
    }
}
