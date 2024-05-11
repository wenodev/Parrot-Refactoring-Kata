package parrot;

public class AfricanParrot extends Parrot {
    protected int numberOfCoconuts;

    protected AfricanParrot(final int numberOfCoconuts, final double voltage, final boolean isNailed) {
        super(voltage, isNailed);
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        return Math.max(0, getBaseSpeed() - 9.0 * numberOfCoconuts);
    }

    @Override
    public String getCry() {
        return "Sqaark!";
    }
}
