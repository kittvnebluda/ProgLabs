package lab2.pokemons;

import lab2.attacks.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Larvesta extends Pokemon {
    static Type[] type = {Type.BUG, Type.FIRE};

    Larvesta(String name, int lvl, Type[] type, int[] stats) {
        super(name, lvl);
        super.setType(type);
        super.setStats(stats[0], stats[1], stats[2], stats[3], stats[4], stats[5]);
    }
    public Larvesta() {
        super("EyeBug", 36);
        super.setType(type);
        super.setStats(55, 85, 55, 50, 55, 60);

        this.addMove(new FlameCharge());
        this.addMove(new Rest());
        this.addMove(new LeechLife());
    }
}
