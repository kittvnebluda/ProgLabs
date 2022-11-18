package lab2.pokemons;

import lab2.attacks.FlameCharge;
import lab2.attacks.LeechLife;
import lab2.attacks.QuiverDance;
import lab2.attacks.Rest;

public class Volcarona extends Larvesta{
    int[] stats = {85, 60, 65, 135, 105, 100};
    {
        initPokemon(super.type, stats);
    }
    Volcarona(String name, int lvl) {
        super(name, lvl);
    }
    public Volcarona() {
        super("FireFlyDemon", 36);

        this.addMove(new FlameCharge());
        this.addMove(new Rest());
        this.addMove(new LeechLife());
        this.addMove(new QuiverDance());
    }
}
