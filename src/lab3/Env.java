package lab3;

import java.util.Random;

public abstract class Env {
    private Env[] env = {};
    private Human human0;
    private Human human1;

    public Env[] getEnv() { return env; }

    public void setEnv(Env[] env) {
        this.env = env;
    }

    public Env find(){
        int r = new Random().nextInt(env.length - 1);
        return env[r];
    }

    public boolean addHuman(Human h) {
        if(human0 == null) human0 = h;
        else if(human1 == null) human1 = h;
        else return false;
        return true;
    }

    public void removeHuman(Human h) {
        if(human0 == h) human0 = null;
        else if(human1 == h) human1 = null;
    }

    public Human[] getHumans() { return new Human[] {human0, human1}; }

}
