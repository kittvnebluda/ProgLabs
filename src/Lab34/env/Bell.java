package Lab34.env;

import Lab34.Env;
import Lab34.Human;

public class Bell extends Env {
    public Bell(String name) {
        super(name);
    }

    @Override
    public void touch(Human h) {
        System.out.println(getName() + " зазвенел");
    }
}
