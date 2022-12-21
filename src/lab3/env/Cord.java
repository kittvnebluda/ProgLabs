package lab3.env;

import lab3.EnvRoom;
import lab3.Human;

public class Cord extends EnvRoom {
    public Cord(String name, EnvRoom[] env) {
        super(name, env);
    }

    @Override
    public void touch(Human h) {
        System.out.println(h.getName() + " потянул(а) за " + getName());
        touchEnv(h);
    }
}
