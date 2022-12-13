package lab3.env;

import lab3.Env;

public class Bell extends Env {
    public Bell(String name) {
        super(name);
    }

    @Override
    public void touch() {
        System.out.println("Колокольчик зазвенел");
    }
}
