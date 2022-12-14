package lab3.humans;

import lab3.Env;
import lab3.Human;

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
        legs.setDressed(false);
    }

    @Override
    public void move(Env env) {
        super.move(env);
        if(env != null) System.out.println(getName() + " переместилась к " + env.getName());
        else System.out.println(getName() + " переместилась в пустоту");
    }
}
