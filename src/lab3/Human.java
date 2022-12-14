package lab3;

public abstract class Human {
    public Legs legs = new Legs();
    public Arms arms = new Arms();

    private Fear fear = Fear.ZERO;

    private String name;

    private Env env;

    public Human(String name) {
        setName(name);
    }

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

    public Env where() {
        return env;
    }

    public void move(Env env) {
        this.env = env;
    }

    public void breakLegs() {
        legs.setBroken(true);
        tremble();
        System.out.println("Похоже " + getName() + " сломал(а) ноги");
    }
    public void restoreLegs() {
        legs.setBroken(false);
        setFear(Fear.ZERO);
        System.out.println(getName() + " восстановил(а) ноги");
    }
    public void breakArms() {
        arms.setBroken(true);
        tremble();
        System.out.println("Похоже " + getName() + " сломал(а) руки");
    }
    public void restoreArms() {
        arms.setBroken(false);
        setFear(Fear.ZERO);
        System.out.println(getName() + " восстановил(а) руки");
    }

    public class Legs extends HumanBodyPart{
        public Legs() {
            super("Ноги");
        }
    }
    public class Arms extends HumanBodyPart{
        public Arms() {
            super("Руки");
        }
    }

    abstract public void tremble();
    abstract public void sight();
    abstract public void explore();

}
