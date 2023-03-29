package Lab3and4.env;

import Lab3and4.Env;
import Lab3and4.Human;

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
