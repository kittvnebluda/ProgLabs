package lab3.env;

import lab3.Env;

public class Cord extends Env {
    public Cord(String name, Env[] env) {
        super(name, env);
    }

    @Override
    public void touch() {
        touchEnv();
    }
}
