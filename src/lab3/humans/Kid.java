package lab3.humans;

import lab3.Env;
import lab3.Fear;
import lab3.Human;

public class Kid extends Human {
    @Override
    public void tremble() {
        setFear(Fear.FEELING_GOOSEBUMPS);
        System.out.println("Малыш затрепетал, как пойманная рыбка");
    }

    @Override
    public void sight() {
        setFear(Fear.ZERO);
        System.out.println("Малыш мягко взглянул на Вас");
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
}
