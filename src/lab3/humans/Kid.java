package lab3.humans;

import lab3.CurtainState;
import lab3.Env;
import lab3.Fear;
import lab3.Human;
import lab3.env.Cord;
import lab3.env.Window;

public class Kid extends Human {
    @Override
    public void tremble() {
        setFear(Fear.FEELING_GOOSEBUMPS);
        System.out.println("Малыш затрепетал, как пойманная рыбка");
    }

    @Override
    public void sight() {
        setFear(Fear.ZERO);
        System.out.println("Малыш мягко взглянул на Вас и успокоился");
    }

    public Kid() {
        super("Малыш");
    }

    @Override
    public void move(Env env) {
        super.move(env);
        if(env != null) System.out.println(getName() + " переместился к " + env.getName());
        else System.out.println(getName() + " переместился в пустоту");
    }

    @Override
    public void explore() {
        if(where() != null) {
            if (legs.isBroken()) {
                if (Math.random() > .5) restoreLegs();
                else System.out.println(getName() + " не смог(ла) восстановить ноги");
            } else if (arms.isBroken()) {
                if (Math.random() > .5) restoreArms();
                else System.out.println(getName() + " не смог(ла) восстановить руки");
            } else {
                where().touch(this);

                if(where() instanceof Window) {
                    if(((Window)where()).getCurtain() == CurtainState.OPENED) {
                        System.out.println("Малыш посмотрел в окно");
                        sight();
                    }
                } else if(where() instanceof Cord) {
                    System.out.println("Шнуры опасны");
                    breakArms();
                } else {
                    if (Math.random() > .8) {
                        breakLegs();
                    }
                }
            }
        } else System.out.println("Малыш находится в пустоте. Он немного нервничает");
    }
}
