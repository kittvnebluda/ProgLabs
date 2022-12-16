package lab3;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public abstract class EnvPattern implements Env{
    private EnvPattern[] env = {};

    private String name;

    public EnvPattern(String name) { setName(name);}
    public EnvPattern(String name, EnvPattern[] env) {
        setName(name);
        setEnv(env);
    }

    public EnvPattern[] getEnv() { return env; }

    public void setEnv(EnvPattern[] env) {
        this.env = env;
    }

    public EnvPattern find(){
        int r = new Random().nextInt(env.length);
        return env[r];
    }
    public EnvPattern find(String name){
        for (EnvPattern env: getEnv()) if(Objects.equals(env.getName(), name)) return env;
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void touchEnv(Human h) {
        for (EnvPattern e: getEnv()) {
            e.touch(h);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EnvPattern env1)) return false;

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
