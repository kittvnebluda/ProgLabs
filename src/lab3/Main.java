package lab3;

import lab3.env.*;
import lab3.humans.FrekenBock;
import lab3.humans.Kid;

public class Main {
    public static void main(String[] args) {
        Door door = new Door("Входная дверь");
        Window window0 = new Window("Окно на внутренний двор");
        Window window1 = new Window("Окно на улицу");
        Bell bell = new Bell("Колокол на крыше");
        Cord cord = new Cord("Шнут от колокола", new Env[]{bell});

        FrekenBock frekenBock = new FrekenBock();
        Kid kid = new Kid();

        Room room = new Room("Комната", new Env[]{door, window0, window1, cord}, frekenBock, kid);
        room.simulate(5);
    }
}

//    отличие отнерфейсов от абстрактных классов
//    solid
//    настледование и реализация интерфейсов
//    дефолтные методы в интерфейсах
//    как связаны hashcode и equals
