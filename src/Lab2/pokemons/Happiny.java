package Lab2.pokemons;

import Lab2.attacks.Refresh;
import Lab2.attacks.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Happiny extends Pokemon {
    static Type[] type = {Type.NORMAL};

    Happiny(String name, int lvl, Type[] type, int[] stats) {
        super(name, lvl);
        super.setType(type);
        super.setStats(stats[0], stats[1], stats[2], stats[3], stats[4], stats[5]);
    }

    public Happiny() {
        super("PinkEgg", 9);
        super.setType(type);
        super.setStats(100, 5, 5, 15, 65, 30);

        this.addMove(new Rest());
        this.addMove(new Refresh());
    }
}
