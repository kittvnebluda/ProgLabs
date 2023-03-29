package Lab3and4.env;

import Lab3and4.Env;
import Lab3and4.Human;

public class Door extends Env {
    private boolean isOpen = false;

    public Door(String name) {
        super(name);
    }

    public void open() {
        if(isOpen) {
            System.out.println(getName() + " уже открыта");
        }
        else {
            isOpen = true;
            System.out.println(getName() + " открылась");
        }
    }

    public void close() {
        if(isOpen) {
            isOpen = false;
            System.out.println(getName() + " закрылась");
        }
        else {
            System.out.println(getName() + " уже закрыта");
        }
    }

    @Override
    public void touch(Human h) {
        System.out.println(h.getName() + " погладил(а) " + getName());
        if (isOpen) System.out.println("Она сейчас открыта");
        else System.out.println("Она сейчас закрыта");
    }
}
