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

    private void separate() {
        System.out.println("-------------------------------");
    }

    public void simulate(int steps) {
        if (find("Входная дверь") != null) {
            // запускаем людей в комнату
            for (Human h: humans) {
                enter(h);
                separate();
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
                separate();
            }
            // выпускаем людей из комнаты
            for (Human h: humans) {
                leave(h);
                separate();
            }
        } else System.out.println("Комната должна содержать входную дверь");
    }
}
