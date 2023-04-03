import java.util.Scanner;

public class PokemonSelection {
    private Scanner scanner;

    public Pokemon createPokemon() {
        String name = readString("Name: ");
        int hitPoints = readInt("Hit points: ");
        String move = readString("Move’s name: ");
        int movePower = readInt("Move’s power: ");
        int attackSpeed = readInt("Attack speed: ");

        return new Pokemon(name, hitPoints, move, movePower, attackSpeed);
    }

    private int readInt(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("\tOops, input should be an integer!");
            }
        }
    }

    private String readString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public void assignPokemon(Player[] players) {
        scanner = new Scanner(System.in);

        for (Player player : players) {
            System.out.printf("\nPlayer %d: Select a Pokemon and enter its stats.\n", player.id);
            player.Pokemon = createPokemon();
            System.out.printf("\nPlayer %d Pokemon:\n", player.id);
            System.out.println(player.Pokemon.displayPokemonStats());
        }

        scanner.close();
    }
}
