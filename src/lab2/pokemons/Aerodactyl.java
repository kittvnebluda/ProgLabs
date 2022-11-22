package lab2.pokemons;

import lab2.attacks.Rest;
import lab2.attacks.StoneEdge;
import lab2.attacks.TakeDown;
import lab2.attacks.ThunderFang;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Aerodactyl extends Pokemon {
    static Type[] type = {Type.FLYING, Type.ROCK};

    Aerodactyl(String name, int lvl, Type[] type, int[] stats) {
        super(name, lvl);
        super.setType(type);
        super.setStats(stats[0], stats[1], stats[2], stats[3], stats[4], stats[5]);
    }
    public Aerodactyl() {
        super("AirStrike", 45);
        super.setType(type);
        super.setStats(80, 105, 65, 60, 75, 130);

        this.addMove(new Rest());
        this.addMove(new StoneEdge());
        this.addMove(new TakeDown());
        this.addMove(new ThunderFang());
    }
}
