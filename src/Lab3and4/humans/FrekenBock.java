package Lab3and4.humans;

import Lab3and4.Env;
import Lab3and4.Fear;
import Lab3and4.Human;
import Lab3and4.HumanInVoidException;
import Lab3and4.env.Cord;

public class FrekenBock extends Human {
    public FrekenBock() {
        super("Фрекен Бок");
    }
    @Override
    public void tremble() {
        System.out.println("Фрекен Бок затрепетала");
    }

    @Override
    public void sight() {
        System.out.println("Фрекен Бок мрачно посмотрела");
    }

    @Override
    public void move(Env env) {
        super.move(env);
        if(env != null) System.out.println(getName() + " переместился к " + env.getName());
        else System.out.println(getName() + " переместился в пустоту");
    }
    @Override
    public void explore() throws HumanInVoidException {
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
        } else throw new HumanInVoidException();
    }
}
