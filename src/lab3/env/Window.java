package lab3.env;

import lab3.CurtainState;
import lab3.Env;

public class Window extends Env {
    private CurtainState curtain = CurtainState.CLOSED;

    public Window(String name) {
        super(name);
    }

    public CurtainState getCurtain() {
        return curtain;
    }

    public void setCurtain(CurtainState curtain) {
        this.curtain = curtain;
    }

    @Override
    public void touch() {
        switch (curtain) {
            case CLOSED -> {
                setCurtain(CurtainState.OPENED);
                System.out.printf(getName(), "шторы открылись");
            }
            case OPENED -> {
                setCurtain(CurtainState.CLOSED);
                System.out.printf(getName(), "шторы закрылись");
            }
            case NOT_WORKING -> {
                setCurtain(CurtainState.OPENED);
                System.out.printf(getName(), "шторы снова стали работать");
            }
        }
        if (Math.random() > 0.5f) {
            setCurtain(CurtainState.NOT_WORKING);
            System.out.printf(getName(), "шторы сломались");
        }
    }
}