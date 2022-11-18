package lab2.pokemons;

import lab2.PokemonBuilder;
import lab2.attacks.Refresh;
import lab2.attacks.Rest;
import ru.ifmo.se.pokemon.Type;

public class Happiny extends PokemonBuilder {
    Type[] type = {Type.NORMAL};
    int[] stats = {100, 5, 5, 15, 65, 30};
    {
        initPokemon(type, stats);
    }
    Happiny(String name, int lvl) {
        super(name, lvl);
    }
    public Happiny() {
        super("PinkEgg", 9);

        this.addMove(new Rest());
        this.addMove(new Refresh());
    }
}
