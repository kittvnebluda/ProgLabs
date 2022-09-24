package lab2;

import ru.ifmo.se.pokemon.Type;

public class Aerodactyl extends PokemonBuilder {
    Type[] type = {Type.FLYING, Type.ROCK};
    int[] stats = {80, 105, 65, 60, 75, 130};

    public Aerodactyl(String name, int lvl) {
        super(name, lvl);
        initPokemon(type, stats);
    }
    public Aerodactyl() {
        initPokemon(type, stats);
    }
}
