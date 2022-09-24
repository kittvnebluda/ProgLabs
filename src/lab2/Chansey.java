package lab2;

public class Chansey extends Happiny{
    int[] stats = {250, 5, 5, 35, 105, 50};

    public Chansey(String name, int lvl) {
        super(name, lvl);
        initPokemon(super.type, stats);
    }
    public Chansey() {
        initPokemon(super.type, stats);
    }
}
