package lab3.env;

import lab3.EnvPattern;
import lab3.Human;

public class Cord extends EnvPattern {
    public Cord(String name, EnvPattern[] env) {
        super(name, env);
    }

    @Override
    public void touch(Human h) {
        System.out.println(h.getName() + " потянул(а) за " + getName());
        touchEnv(h);
    }
}
