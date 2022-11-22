package lab2.pokemons;

import lab2.attacks.Refresh;
import lab2.attacks.Rest;
import lab2.attacks.SeismicToss;
import lab2.attacks.ThunderWave;
import ru.ifmo.se.pokemon.Type;

public class Blissey extends Chansey{
    static int[] stats = {255, 10, 10, 75, 135, 55};

    Blissey(String name, int lvl, Type[] type, int[] stats) {
        super(name, lvl, type, stats);
    }

    public Blissey() {
        super("PinkDeath", 9, type, stats);

        this.addMove(new Rest());
        this.addMove(new Refresh());
        this.addMove(new SeismicToss());
        this.addMove(new ThunderWave());
    }
}
