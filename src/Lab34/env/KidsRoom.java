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

    public static class NoEnteranceDoorError extends Error {
        public NoEnteranceDoorError() {
            super("Детская комната должна содержать входную дверь");
        }
    }

    @Override
    public void enter(MobileCreature c) {
        Env door = findEnv("Входная дверь");

        if (door instanceof Door) {
            ((Door)door).open();
            c.move(this);
            ((Door)door).close();

        } else System.out.println("Входная дверь не найдена");
    }

    @Override
    public void leave(MobileCreature c) {
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
        //findEnv().touch(h);
    }

    private void separate() {
        System.out.println("-------------------------------");
    }
    private void lowSeparate() {
        System.out.println("-   -   -   -   -   -   -   -  ");
    }

    public void simulate(int steps) {
        if (findEnv("Входная дверь") != null) {
            separate();
            for (int i = 0; i < steps; i++) {
                currentTime = currentTime.changeTime();
                lowSeparate();

                // получаем случайную среду и случайного человека
                Env rEnv = findEnv();
                Human rHuman = humans[new Random().nextInt(humans.length)];

                try {
                    // перемещаем человека и активируем среду
                    if (rHuman.legs.isBroken() || rHuman.arms.isBroken()) {
                        rHuman.explore();
                    }
                    else {
                        rHuman.explore();
                        rHuman.move(rEnv);
                    }
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

        } else throw new NoEnteranceDoorError();
    }
}
