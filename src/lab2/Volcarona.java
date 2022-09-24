package lab2;

public class Volcarona extends Larvesta{
    int[] stats = {85, 60, 65, 135, 105, 100};

    public Volcarona(String name, int lvl) {
        super(name, lvl);
        initPokemon(super.type, stats);
    }
    public Volcarona() {
        initPokemon(super.type, stats);
    }
}
