package lab3;

import java.util.Objects;
import java.util.Random;

public abstract class Env {
    private Env[] env = {};
    private Human human0;
    private Human human1;

    private String name = "Какая-то странная среда";

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

    public boolean addHuman(Human h) {
        if(human0 == null) human0 = h;
        else if(human1 == null) human1 = h;
        else return false;
        return true;
    }

    public boolean removeHuman(Human h) {
        if(human0 == h) {
            human0 = null;
            return true;
        } else if(human1 == h) {
            human1 = null;
            return true;
        }
        return false;
    }

    public Human[] getHumans() { return new Human[] {human0, human1}; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void touchEnv() {
        for (Env e: getEnv()) {
            e.touch();
        }
    }

    abstract public void touch();
}
