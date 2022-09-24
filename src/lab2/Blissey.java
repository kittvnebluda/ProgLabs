package lab2;

public class Blissey extends Chansey{
    int[] stats = {255, 10, 10, 75, 135, 55};

    public Blissey(String name, int lvl) {
        super(name, lvl);
        initPokemon(super.type, stats);
    }
    public Blissey() {
        initPokemon(super.type, stats);
    }
}
