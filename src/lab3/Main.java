package lab3;

import lab3.env.*;
import lab3.humans.FrekenBock;
import lab3.humans.Kid;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Door door = new Door("Входная дверь");
        Window window = new Window("Окно на внутренний двор");
        Bell bell = new Bell("Колокол на крыше");
        Cord cord = new Cord("Шнут от колокола", new Env[]{bell});

        FrekenBock frekenBock = new FrekenBock();
        Kid kid = new Kid();

        Room00 room = new Room00("Комната", new Env[]{door, window, cord}, frekenBock, kid);

        room.simulate();
    }
}
