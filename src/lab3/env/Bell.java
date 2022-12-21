package lab3.env;

import lab3.EnvRoom;
import lab3.Human;

public class Bell extends EnvRoom {
    public Bell(String name) {
        super(name);
    }

    @Override
    public void touch(Human h) {
        System.out.println(getName() + " зазвенел");
    }
}
