package lab2.pokemons;

import lab2.attacks.Refresh;
import lab2.attacks.Rest;
import lab2.attacks.SeismicToss;
import lab2.attacks.ThunderWave;

public class Blissey extends Chansey{
    int[] stats = {255, 10, 10, 75, 135, 55};
    {
        initPokemon(type, stats);
    }
    Blissey(String name, int lvl) {
        super(name, lvl);
    }
    public Blissey() {
        super("PinkDeath", 9);

        this.addMove(new Rest());
        this.addMove(new Refresh());
        this.addMove(new SeismicToss());
        this.addMove(new ThunderWave());
    }
}
