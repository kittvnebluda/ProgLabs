package lab3;

public abstract class HumanBodyPart {
    public final Size size = Size.BIG;

    private Cleanliness condition = Cleanliness.CLEAN;
    private boolean isDressed = true;

    public Cleanliness getCondition() {
        return condition;
    }

    public void setCondition(Cleanliness condition) {
        this.condition = condition;
    }

    public boolean isDressed() {
        return isDressed;
    }

    public void setDressed(boolean dressed) {
        isDressed = dressed;
    }
}
