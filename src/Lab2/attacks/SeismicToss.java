package Lab2.attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class SeismicToss extends PhysicalMove {
    public SeismicToss() {
        super(Type.FIGHTING, 1, 100);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        super.power = p.getLevel();
    }
    @Override
    protected String describe() {
        return("uses Seismic Toss");
    }
}
