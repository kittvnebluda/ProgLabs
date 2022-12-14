package lab3;

import java.util.Objects;
import java.util.Random;

public abstract class Env {
    private Env[] env = {};

    private String name;

    public Env(String name) { setName(name);}
    public Env(String name, Env[] env) {
        setName(name);
        setEnv(env);
    }

    public Env[] getEnv() { return env; }

    public void setEnv(Env[] env) {
        this.env = env;
    }

    public Env find(){
        int r = new Random().nextInt(env.length - 1);
        return env[r];
    }
    public Env find(String name){
        for (Env env: getEnv()) {
            if(Objects.equals(env.getName(), name)) return env;
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void touchEnv(Human h) {
        for (Env e: getEnv()) {
            e.touch(h);
        }
    }

    abstract public void touch(Human h);
}
