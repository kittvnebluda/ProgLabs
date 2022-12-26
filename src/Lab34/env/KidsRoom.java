package Lab34.env;

import Lab34.*;

import java.util.Random;

public class KidsRoom extends Env implements Enterable, Exitable, Simulatable {
    public Human[] humans;
    public Time currentTime = Time.EVENING;

    public KidsRoom(String name, Env[] env, Human ... humans) {
        super(name, env);
        this.humans = humans;
    }

    @Override
    public void enter(CanMove c) {
        Env door = findEnv("Входная дверь");

        if (door instanceof Door) {
            ((Door)door).open();
            c.move(this);
            ((Door)door).close();

        } else System.out.println("Входная дверь не найдена");
    }

    @Override
    public void leave(CanMove c) {
        Env door = findEnv("Входная дверь");

        if (door instanceof Door) {
            ((Door)door).open();
            c.move(null);
            ((Door)door).close();

        } else System.out.println("Входная дверь не найдена");
    }

    @Override
    public void touch(Human h) {
        System.out.println(h.getName() + " зачем-то прикоснулся к комнате\nКомната сочла это приятным и возбудилась");
    }

    private void separate() {
        System.out.println("-------------------------------");
    }
    private void separateTime() {
        System.out.println("-   -   -   -   -   -   -   -  ");
    }

    public void simulate(int steps) {
        class NoEntranceDoorException extends RuntimeException {
            public NoEntranceDoorException() {
                super("Детская комната должна содержать входную дверь");
            }
        }

        if (findEnv("Входная дверь") != null) {
            separate();
            for (int i = 0; i < steps; i++) {
                currentTime = currentTime.changeTime();
                separateTime();

                // получаем случайную среду и случайного человека
                Env rEnv = findEnv();
                Human rHuman = humans[new Random().nextInt(humans.length)];

                // перемещаем человека и активируем среду
                try {
                    rHuman.explore();
                    if (!(rHuman.legs.isBroken() || rHuman.arms.isBroken())) rHuman.move(rEnv);
                }
                catch (HumanInVoidException e) {
                    System.out.println(e.getMessage());
                    enter(rHuman);
                }
                separate();
            }
            // выпускаем людей из комнаты
            for (Human h: humans) {
                if (h.getEnv() != null) {
                    leave(h);
                    separate();
                }
            }

        } else throw new NoEntranceDoorException();
    }
}
