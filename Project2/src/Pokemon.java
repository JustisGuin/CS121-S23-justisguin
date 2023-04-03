public class Pokemon {
    private String name;
    private int hitPoints;
    private String move;
    private int movePower;
    private int attackSpeed;

    public Pokemon(String name, int hitPoints, String move, int movePower, int attackSpeed) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.move = move;
        this.movePower = movePower;
        this.attackSpeed = attackSpeed;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public String getMove() {
        return move;
    }

    public int getMovePower() {
        return movePower;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public void setMovePower(int movePower) {
        this.movePower = movePower;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    // Display stats method
    public String displayPokemonStats() {
        String stats = "Name: " + name + "\n";
        stats += "Hit Points: " + hitPoints + "\n";
        stats += "Move: " + move + "\n";
        stats += "Move Power: " + movePower + "\n";
        stats += "Attack Speed: " + attackSpeed;
        return stats;
    }
}

