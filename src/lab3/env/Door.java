package lab3.env;

import lab3.Env;

public class Door extends Env {
    private boolean isOpen = false;
    public Door(String name) {
        super(name);
    }

    @Override
    public void touch() {
        if(isOpen) {
            isOpen = false;
            System.out.printf(getName(), "закрылась");
        }
        else {
            isOpen = true;
            System.out.printf(getName(), "открылась");
        }
    }
}
