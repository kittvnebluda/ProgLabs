/*
   Лабораторная работа №2
   Вариант 43243
   Группа R3138 Сизиков Григорий
*/
package Lab2;

import Lab2.pokemons.*;
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