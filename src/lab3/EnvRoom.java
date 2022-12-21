package lab3;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public abstract class EnvRoom implements Env{
    private EnvRoom[] env = {};

    private String name;

    public EnvRoom(String name) { setName(name);}
    public EnvRoom(String name, EnvRoom[] env) {
        setName(name);
        setEnv(env);
    }

    public EnvRoom[] getEnv() { return env; }

    public void setEnv(EnvRoom[] env) {
        this.env = env;
    }

    public EnvRoom findEnv(){
        int r = new Random().nextInt(env.length);
        return env[r];
    }
    public EnvRoom findEnv(String name){
        for (EnvRoom env: getEnv()) if(Objects.equals(env.getName(), name)) return env;
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void touchEnv(Human h) {
        for (EnvRoom e: getEnv()) {
            e.touch(h);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EnvRoom env1)) return false;

        if (!Arrays.equals(env, env1.env)) return false;
        return name.equals(env1.name);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(env);
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Env{" +
                "env=" + Arrays.toString(env) +
                ", name='" + name + '\'' +
                '}';
    }
}
