package lab3;

public abstract class HumanBodyPart {
    private String name;
    private boolean isBroken = false;

    public HumanBodyPart(String name) {setName(name);}

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
