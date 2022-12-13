package lab3;

public abstract class Human {
    public Legs legs = new Legs();
    public Arms arms = new Arms();

    private Fear fear = Fear.ZERO;

    private String name;

    public Fear getFear() {
        return fear;
    }

    public void setFear(Fear fear) {
        this.fear = fear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Legs extends HumanBodyPart{}
    public class Arms extends HumanBodyPart{}

    abstract public void tremble();
    abstract public void sight();
}
