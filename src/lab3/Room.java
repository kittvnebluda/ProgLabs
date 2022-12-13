package lab3;

public interface Room {
    void moveHuman(Human h, Env e);
    void enter(Human h);
    void leave(Human h);
}
