package lab3.env;

import lab3.Env;
import lab3.Human;
import lab3.Main;
import lab3.Room;

import java.util.Random;

public class Room00 extends Env implements Room {
    public Room00(String name, Env[] env, Human ... humans) {
        super(name, env);
        for(Human h: humans) addHuman(h);
    }

    @Override
    public void moveHuman(Human h, Env env) {
        if(env.addHuman(h)) {

            for (Env e : getEnv()) e.removeHuman(h);
            System.out.printf(h.getName(), "переместился к", env.getName());

        } else System.out.printf(h.getName(), "не удалось переместиться");
    }

    @Override
    public void enter(Human h) {
        Env door = find("Входная дверь");

        if (door instanceof Door) {
            door.touch();
            if(addHuman(h)) System.out.printf(h.getName(), "вошел в", getName());
            door.touch();

        } else System.out.println("Входная дверь не найдена");
    }

    @Override
    public void leave(Human h) {
        Env door = find("Входная дверь");

        if (door instanceof Door) {
            door.touch();
            if(removeHuman(h)) System.out.printf(h.getName(), "вышел из", getName());
            door.touch();

        } else System.out.println("Входная дверь не найдена");
    }

    @Override
    public void touch() {
        System.out.println("Вы зачем-то прикоснулись к комнате");
        System.out.println("Комната сочла это приятным и возбудилась");
        find().touch();
    }

    public void simulate() throws InterruptedException {
        while (true){
            // получаем случайную среду и случайного человека
            Env rEnv = find();
            Human rHuman = getHumans()[new Random().nextInt(getHumans().length)];

            // перемещаем человека и активируем среду
            moveHuman(rHuman, rEnv);
            rEnv.touch();

            // спим
            Thread.sleep(1000);
        }
    }
}
