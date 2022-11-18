package lab2;

import lab2.pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Test {
    public static void main(String[] args) {
        Battle b = new Battle();
        var p1 = new Blissey();
        var p2 = new Volcarona();
        b.addAlly(p1);
        b.addFoe(p2);
        b.go();
    }
}
