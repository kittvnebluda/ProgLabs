package lab2.pokemons;

import lab2.PokemonBuilder;
import lab2.attacks.*;
import ru.ifmo.se.pokemon.Type;

public class Larvesta extends PokemonBuilder {
    Type[] type = {Type.BUG, Type.FIRE};
    int[] stats = {55, 85, 55, 50, 55, 60};
    {
        initPokemon(type, stats);
    }
    Larvesta(String name, int lvl) {
        super(name, lvl);
    }
    public Larvesta() {
        super("EyeBug", 36);

        this.addMove(new FlameCharge());
        this.addMove(new Rest());
        this.addMove(new LeechLife());
    }
}
