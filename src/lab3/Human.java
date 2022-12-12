package lab3;

public abstract class Human {
    public Legs legs = new Legs();
    public Arms arms = new Arms();

    private Fear fear = Fear.ZERO;

    public Fear getFear() {
        return fear;
    }

    public void setFear(Fear fear) {
        this.fear = fear;
    }

    private class Legs extends HumanBodyPart{

    }
    private class Arms extends HumanBodyPart{

    }

    abstract public void tremble();
    abstract public void sight();
}
