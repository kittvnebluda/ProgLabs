package lab3;

public abstract class Human implements CreatureSeeing, CreatureTrembling, CreatureMoving{
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

    public Env getEnv() {
        return env;
    }

    @Override
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (!legs.equals(human.legs)) return false;
        if (!arms.equals(human.arms)) return false;
        if (fear != human.fear) return false;
        if (!name.equals(human.name)) return false;
        return env.equals(human.env);
    }

    @Override
    public int hashCode() {
        int result = legs.hashCode();
        result = 31 * result + arms.hashCode();
        result = 31 * result + fear.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + env.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Human{" +
                "legs=" + legs +
                ", arms=" + arms +
                ", fear=" + fear +
                ", name='" + name + '\'' +
                ", env=" + env +
                '}';
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
}
