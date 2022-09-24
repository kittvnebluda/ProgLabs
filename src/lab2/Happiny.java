package lab2;

import ru.ifmo.se.pokemon.Type;

public class Happiny extends PokemonBuilder{
    Type[] type = {Type.NORMAL};
    int[] stats = {100, 5, 5, 15, 65, 30};

    public Happiny(String name, int lvl) {
        super(name, lvl);
        initPokemon(type, stats);
    }
    public Happiny() {
        initPokemon(type, stats);
    }
}
