package lab2.attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class TakeDown extends PhysicalMove {
    public TakeDown() {
        super(Type.NORMAL, 90, 85);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.HP, 1);  // should be 1/4 of inflicted damage instead of 1
    }
    @Override
    protected String describe() {
        return("uses Take Down");
    }
}
