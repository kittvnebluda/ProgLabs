package Lab2.attacks;

import ru.ifmo.se.pokemon.*;

public class ThunderFang extends PhysicalMove {
    public ThunderFang() {
        super(Type.ELECTRIC, 65, 95);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (!p.hasType(Type.ELECTRIC) && Math.random() <= 0.1) {
            Effect e = new Effect().condition(Status.PARALYZE).attack(0.75).turns(-1);
            e.stat(Stat.SPEED, -2);
            p.setCondition(e);
        }
    }
    @Override
    protected String describe() {
        return("uses Thunder Fang");
    }
}
