package lab2.attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class LeechLife extends PhysicalMove {
    public LeechLife() {
        super(Type.BUG, 80, 100);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.HP, (int)(p.getHP() - p.getStat(Stat.HP))/2);
    }
    @Override
    protected String describe() {
        return("uses Leech Life");
    }
}
