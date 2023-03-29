package Lab3and4;

import Lab3and4.env.*;
import Lab3and4.humans.Carlson;
import Lab3and4.humans.FrekenBock;
import Lab3and4.humans.Kid;

public class Main {
    public static void main(String[] args) {
        Door door = new Door("Входная дверь");
        Window windowCourt = new Window("Окно на внутренний двор");
        Window windowStreet = new Window("Окно на улицу");
        Bell bell = new Bell("Колокол на крыше");
        Cord cord = new Cord("Шнут от колокола", new Env[]{bell});

        FrekenBock frekenBock = new FrekenBock();
        Kid kid = new Kid();
        Carlson carlson = new Carlson();

        KidsRoom roomWorld = new KidsRoom("Комната", new Env[]{door, windowCourt, windowStreet, cord}, frekenBock, kid, carlson);
        roomWorld.simulate(10);
    }
}
