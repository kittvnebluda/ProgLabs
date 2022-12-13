package lab3.humans;

import lab3.Fear;
import lab3.Human;

public class Kid extends Human {
    @Override
    public void tremble() {
        setFear(Fear.FEELING_GOOSEBUMPS);
        System.out.printf("Малыш затрепетал, как пойманная рыбка");
    }

    @Override
    public void sight() {
        setFear(Fear.ZERO);
        System.out.printf("Малыш мягко взглянул на Вас");
    }

    public Kid() {
        setName("Малыш");
    }
}
