package Lab34.humans;

import Lab34.Env;
import Lab34.Fear;
import Lab34.Human;
import Lab34.HumanInVoidException;

public class Carlson extends Human {
    public Carlson() {
        super("Карлсон");
    }

    @Override
    public void explore() throws HumanInVoidException {
        if(getEnv() != null) getEnv().touch(this);
        else throw new HumanInVoidException();
    }

    @Override
    public void sight() {
        System.out.println("Карлсон ничего не видит под покрывалом");
    }

    @Override
    public void tremble() {
        System.out.println("Карлсон почуствовал неладное");
        setFear(Fear.FEELING_GOOSEBUMPS);
    }

    @Override
    public void move(Env env) {
        super.move(env);
        if(env != null) System.out.println(getName() + " перелетел к " + env.getName());
        else System.out.println(getName() + " залетел в пустоту");
    }
}
