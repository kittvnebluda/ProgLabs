package lab2.pokemons;

import lab2.PokemonBuilder;
import lab2.attacks.Rest;
import lab2.attacks.StoneEdge;
import lab2.attacks.TakeDown;
import lab2.attacks.ThunderFang;
import ru.ifmo.se.pokemon.Type;

public class Aerodactyl extends PokemonBuilder {
    Type[] type = {Type.FLYING, Type.ROCK};
    int[] stats = {80, 105, 65, 60, 75, 130};
    {
        initPokemon(type, stats);
    }
    Aerodactyl(String name, int lvl) {
        super(name, lvl);
    }
    public Aerodactyl() {
        super("AirStrike", 45);

        this.addMove(new Rest());
        this.addMove(new StoneEdge());
        this.addMove(new TakeDown());
        this.addMove(new ThunderFang());
    }
}
