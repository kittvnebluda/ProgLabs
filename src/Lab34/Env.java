package Lab34;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public abstract class Env implements Touchable {
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

    public Env findEnv(){
        int r = new Random().nextInt(env.length);
        return env[r];
    }
    public Env findEnv(String name){
        for (Env env: getEnv()) if(Objects.equals(env.getName(), name)) return env;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Env env1)) return false;

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
        return "Touchable{" +
                "env=" + Arrays.toString(env) +
                ", name='" + name + '\'' +
                '}';
    }
}
