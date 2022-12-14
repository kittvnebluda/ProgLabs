package lab3;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HumanBodyPart that = (HumanBodyPart) o;

        if (isBroken != that.isBroken) return false;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (isBroken ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "HumanBodyPart{" +
                "name='" + name + '\'' +
                ", isBroken=" + isBroken +
                '}';
    }
}
