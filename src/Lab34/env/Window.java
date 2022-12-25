package Lab34.env;

import Lab34.*;

public class Window extends Env implements Exitable {
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
    public void touch(Human h) {
        switch (curtain) {
            case CLOSED -> {
                setCurtain(CurtainState.OPENED);
                System.out.printf("%s: %s открыл(а) шторы\n", getName(), h.getName());
                if (Math.random() > 0.3f) leave(h);
            }
            case OPENED -> {
                setCurtain(CurtainState.CLOSED);
                System.out.printf("%s: %s закрыл(а) шторы\n", getName(), h.getName());
            }
            case NOT_WORKING -> {
                setCurtain(CurtainState.OPENED);
                System.out.printf("%s: %s починил(а) шторы\n", getName(), h.getName());
            }
        }
        if (Math.random() > 0.7f) {
            setCurtain(CurtainState.NOT_WORKING);
            System.out.println(getName() + ": шторы сломались");
        }
    }

    @Override
    public void leave(MobileCreature c) {
        System.out.println("Кто-то выпал из окна");
        if (c instanceof Human) ((Human)c).breakLegs();
        c.move(null);

    }
}