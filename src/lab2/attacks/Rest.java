package lab2.attacks;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    Effect sleep = new Effect().condition(Status.SLEEP).attack(0.0).turns(2);

    public Rest() {
        super(Type.PSYCHIC, 0, 1);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setCondition(sleep);
        // I think, it should be after 2 turns, but HOW
        p.setMod(Stat.HP, (int)(p.getHP() - p.getStat(Stat.HP)));
    }
    @Override
    protected String describe() {
        return("uses Rest");
    }
}
