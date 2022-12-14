package lab3.env;

import lab3.*;

import java.util.Random;

public class Room extends Env implements EnvInput, EnvOutput, EnvSimulating {
    public Human[] humans;

    public Room(String name, Env[] env, Human ... humans) {
        super(name, env);
        this.humans = humans;
    }

    @Override
    public void enter(CreatureMoving c) {
        Env door = find("Входная дверь");

        if (door instanceof Door) {
            ((Door)door).open();
            c.move(this);
            ((Door)door).close();

        } else System.out.println("Входная дверь не найдена");
    }

    @Override
    public void leave(CreatureMoving c) {
        Env door = find("Входная дверь");

        if (door instanceof Door) {
            ((Door)door).open();
            c.move(null);
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
            for (int i = 0; i < steps; i++) {
                // получаем случайную среду и случайного человека
                Env rEnv = find();
                Human rHuman = humans[new Random().nextInt(humans.length)];

                if(rHuman.getEnv() != null) {
                    // перемещаем человека и активируем среду
                    if (rHuman.legs.isBroken() || rHuman.arms.isBroken()) rHuman.explore();
                    else {
                        rHuman.move(rEnv);
                        rHuman.explore();
                    }
                } else enter(rHuman);
                separate();
            }
            // выпускаем людей из комнаты
            for (Human h: humans) {
                if (h.getEnv() != null) {
                    leave(h);
                    separate();
                }
            }

        } else System.out.println("Комната должна содержать входную дверь");
    }
}
