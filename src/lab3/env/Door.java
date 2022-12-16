package lab3.env;

import lab3.EnvPattern;
import lab3.Human;

public class Door extends EnvPattern {
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
        System.out.println(h.getName() + " погладил(а) дверь");
        if (isOpen) System.out.println("Она сейчас открыта");
        else System.out.println("Она сейчас закрыта");
    }
}
