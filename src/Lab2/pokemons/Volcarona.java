package Lab2.pokemons;

import Lab2.attacks.FlameCharge;
import Lab2.attacks.LeechLife;
import Lab2.attacks.QuiverDance;
import Lab2.attacks.Rest;
import ru.ifmo.se.pokemon.Type;

public class Volcarona extends Larvesta{
    static int[] stats = {85, 60, 65, 135, 105, 100};

    Volcarona(String name, int lvl, Type[] type, int[] stats) {
        super(name, lvl, type, stats);
    }
    public Volcarona() {
        super("FireFlyDemon", 36, type, stats);

        this.addMove(new FlameCharge());
        this.addMove(new Rest());
        this.addMove(new LeechLife());
        this.addMove(new QuiverDance());
    }
}
