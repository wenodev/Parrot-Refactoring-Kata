package parrot;

public class AfricanParrot extends Parrot {
    protected int numberOfCoconuts;
    protected boolean isNailed;

    protected AfricanParrot(final int numberOfCoconuts, final double voltage, final boolean isNailed) {
        super();
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
    }

    @Override
    public String getCry() {
        return "Sqaark!";
    }
}
