package lab3.env;

import lab3.Env;
import lab3.Human;
import lab3.Room;

import java.util.Random;

public class Room00 extends Env implements Room {
    public Human[] humans;

    public Room00(String name, Env[] env, Human ... humans) {
        super(name, env);
        this.humans = humans;
    }

    @Override
    public void moveHuman(Human h, Env env) {
        h.move(env);
    }

    @Override
    public void enter(Human h) {
        Env door = find("Входная дверь");

        if (door instanceof Door) {
            ((Door)door).open();
            moveHuman(h, this);
            ((Door)door).close();

        } else System.out.println("Входная дверь не найдена");
    }

    @Override
    public void leave(Human h) {
        Env door = find("Входная дверь");

        if (door instanceof Door) {
            ((Door)door).open();
            moveHuman(h, null);
            ((Door)door).close();

        } else System.out.println("Входная дверь не найдена");
    }

    @Override
    public void touch(Human h) {
        System.out.println(h.getName() +
                " зачем-то прикоснулся к комнате\nКомната сочла это приятным и возбудилась");
        find().touch(h);
    }

    private void sleep() throws InterruptedException {
        System.out.println("-------------------------------");
        Thread.sleep(5000);
    }

    public void simulate(int steps) throws InterruptedException {
        // запускаем людей в комнату
        for (Human h: humans) {
            enter(h);
            sleep();
        }
        for (int i = 0; i < steps; i++) {
            // получаем случайную среду и случайного человека
            Env rEnv = find();
            Human rHuman = humans[new Random().nextInt(humans.length)];

            // перемещаем человека и активируем среду
            if (rHuman.legs.isBroken() || rHuman.arms.isBroken()) rHuman.explore();
            else {
                moveHuman(rHuman, rEnv);
                rHuman.explore();
            }
            sleep();
        }
        // выпускаем людей из комнаты
        for (Human h: humans) {
            leave(h);
            sleep();
        }
    }
}
