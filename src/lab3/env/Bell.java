package lab3.env;

import lab3.Env;
import lab3.Human;

public class Bell extends Env {
    public Bell(String name) {
        super(name);
    }

    @Override
    public void touch(Human h) {
        System.out.println(getName() + " зазвенел");
    }
}
