package lab2.attacks;

import ru.ifmo.se.pokemon.*;

public class StoneEdge extends PhysicalMove {
    public StoneEdge() {
        super(Type.ROCK, 100, 80);
    }
//    @Override
//    protected void applySelfEffects(Pokemon p) {
//        // should change critical hit ratio to 1/8
//        Effect criticalAttack =
//                new Effect().chance(0.5).turns(0).stat(Stat.ATTACK, (int)(p.getStat(Stat.ATTACK) * (1/8)));
//        p.addEffect(criticalAttack);
//    }
    @Override
    protected String describe() {
        return("uses Stone Edge");
    }
}
