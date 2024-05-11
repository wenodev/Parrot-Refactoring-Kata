package parrot;

public class NorwegianParrot extends Parrot {
    protected double voltage;
    protected boolean isNailed;

    protected NorwegianParrot(final double voltage, final boolean isNailed) {
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
    }

    @Override
    public String getCry() {
        return voltage > 0 ? "Bzzzzzz" : "...";
    }
}
