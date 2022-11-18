package lab2;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class PokemonBuilder extends Pokemon {
    public Type[] type = {};

    public PokemonBuilder(String name, int lvl) {
        super(name, lvl);
    }

    public final void initPokemon(Type[] type, int[] stats) {
        super.setType(type);
        super.setStats(stats[0], stats[1], stats[2], stats[3], stats[4], stats[5]);
    }
}
