package lab2;

import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

import static lab2.TestPrint.printSomeNameOfYourFriendOrNotYourFriend;

public class Test {
    public static void main(String[] args) {
//        printSomeNameOfYourFriendOrNotYourFriend();
//
//        TestPrint testPrint = new TestPrint();
//        testPrint.getMeYourNameAndIPrintIt("ALISA");

        Battle b = new Battle();
        Aerodactyl p1 = new Aerodactyl("AeroFly", 66);
        Pokemon p2 = new Blissey("PinkDeath", 99);
        b.addAlly(p1);
        b.addFoe(p2);
        b.go();
    }
}
