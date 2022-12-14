package lab3.humans;

import lab3.Env;
import lab3.Fear;
import lab3.Human;
import lab3.env.Cord;

public class FrekenBock extends Human {
    @Override
    public void tremble() {
        System.out.println("Фрекен Бок затрепетала");
    }

    @Override
    public void sight() {
        System.out.println("Фрекен Бок мрачно посмотрела");
    }

    public FrekenBock() {
        super("Фрекен Бок");
    }

    @Override
    public void move(Env env) {
        super.move(env);
        if(env != null) System.out.println(getName() + " переместилась к " + env.getName());
        else System.out.println(getName() + " переместилась в пустоту");
    }

    @Override
    public void explore() {
        if(getEnv() != null) {
            if (legs.isBroken()) {
                if (Math.random() > .8) restoreLegs();
                else System.out.println(getName() + " не смог(ла) восстановить ноги");
            } else if (arms.isBroken()) {
                if (Math.random() > .8) restoreArms();
                else System.out.println(getName() + " не смог(ла) восстановить руки");
            } else {
                getEnv().touch(this);

                if(getEnv() instanceof Cord) {
                    System.out.println("Шнуры опасны");
                    breakArms();
                } else {
                    if (Math.random() > .8) {
                        breakLegs();
                    }
                }

                if (getFear() != Fear.ZERO) {
                    setFear(Fear.ZERO);
                    System.out.println("Фрекен Бок успокоилась");
                }
            }
        } else System.out.println("Фрекен Бок находится в пустоте. Похоже ей это нравится");
    }
}
