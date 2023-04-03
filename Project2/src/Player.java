public class Player {
    private static int userCount = 0;

    private final int id;
    private Pokemon pokemon;

    public Player() {
        this.id = ++userCount;
    }

    public int getId() {
        return id;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
}