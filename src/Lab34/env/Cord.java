package Lab34.env;

import Lab34.Env;
import Lab34.Human;

public class Cord extends Env {
    public Cord(String name, Env[] env) {
        super(name, env);
    }

    @Override
    public void touch(Human h) {
        System.out.println(h.getName() + " потянул(а) за " + getName());
        touchEnv(h);
    }
}
