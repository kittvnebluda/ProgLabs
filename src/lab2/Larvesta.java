package lab2;

import ru.ifmo.se.pokemon.Type;

public class Larvesta extends PokemonBuilder {
    Type[] type = {Type.BUG, Type.FIRE};
    int[] stats = {55, 85, 55, 50, 55, 60};

    public Larvesta(String name, int lvl) {
        super(name, lvl);
        initPokemon(type, stats);
    }
    public Larvesta() {
        initPokemon(type, stats);
    }
}
