package Lab2.pokemons;

import Lab2.attacks.Refresh;
import Lab2.attacks.Rest;
import Lab2.attacks.SeismicToss;
import ru.ifmo.se.pokemon.Type;

public class Chansey extends Happiny{
    static int[] stats = {250, 5, 5, 35, 105, 50};

    Chansey(String name, int lvl, Type[] type, int[] stats) {
        super(name, lvl, type, stats);
    }
    public Chansey() {
        super("FreshEgg", 9, type, stats);

        this.addMove(new Rest());
        this.addMove(new Refresh());
        this.addMove(new SeismicToss());
    }
}
