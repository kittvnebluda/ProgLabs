package Lab2.attacks;

import ru.ifmo.se.pokemon.*;

public class Refresh extends StatusMove {
    public Refresh() {
        super(Type.NORMAL, 0, 1);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setCondition(new Effect().condition(Status.NORMAL).attack(0.0).turns(-1));
    }
    @Override
    protected String describe() {
        return("uses Refresh");
    }
}
