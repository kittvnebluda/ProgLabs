package Lab3and4.env;

import Lab3and4.Env;
import Lab3and4.Human;

public class Bell extends Env {
    public Bell(String name) {
        super(name);
    }

    @Override
    public void touch(Human h) {
        System.out.println(getName() + " зазвенел");
    }
}
