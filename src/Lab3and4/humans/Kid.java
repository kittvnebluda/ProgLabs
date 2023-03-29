package Lab3and4.humans;

import Lab3and4.*;
import Lab3and4.env.Cord;
import Lab3and4.env.Window;

public class Kid extends Human {
    public Kid() {
        super("Малыш");
    }
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
                if (Math.random() > .5) restoreLegs();
                else System.out.println(getName() + " не смог(ла) восстановить ноги");
            } else if (arms.isBroken()) {
                if (Math.random() > .5) restoreArms();
                else System.out.println(getName() + " не смог(ла) восстановить руки");
            } else {
                getEnv().touch(this);

                if(getEnv() instanceof Window) {
                    if(((Window) getEnv()).getCurtain() == CurtainState.OPENED) {
                        System.out.println(" Малыш стоял у окна своей комнаты, глядел на звезды, мерцавшие над крышами.");
                        sight();
                    }
                } else if(getEnv() instanceof Cord) {
                    System.out.println("Шнуры опасны");
                    breakArms();
                } else {
                    if (Math.random() > .8) {
                        breakLegs();
                    }
                }
            }
        } else throw new HumanInVoidException();
    }
}
