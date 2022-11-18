package lab2.pokemons;

import lab2.attacks.Refresh;
import lab2.attacks.Rest;
import lab2.attacks.SeismicToss;

public class Chansey extends Happiny{
    int[] stats = {250, 5, 5, 35, 105, 50};
    {
        initPokemon(type, stats);
    }
    Chansey(String name, int lvl) {
        super(name, lvl);
    }
    public Chansey() {
        super("FreshEgg", 9);

        this.addMove(new Rest());
        this.addMove(new Refresh());
        this.addMove(new SeismicToss());
    }
}
