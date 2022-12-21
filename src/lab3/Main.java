package lab3;

import lab3.env.*;
import lab3.humans.FrekenBock;
import lab3.humans.Kid;

public class Main {
    public static void main(String[] args) {
        Door door = new Door("Входная дверь");
        Window windowCourt = new Window("Окно на внутренний двор");
        Window windowStreet = new Window("Окно на улицу");
        Bell bell = new Bell("Колокол на крыше");
        Cord cord = new Cord("Шнут от колокола", new EnvRoom[]{bell});

        FrekenBock frekenBock = new FrekenBock();
        Kid kid = new Kid();

        RoomWorld roomWorld = new RoomWorld("Комната", new EnvRoom[]{door, windowCourt, windowStreet, cord}, frekenBock, kid);
        roomWorld.simulate(6);
    }
}

// Называть интерфейсы прилагательными
// Функц программирование
// Enum