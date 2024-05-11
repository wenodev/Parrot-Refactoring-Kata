package parrot;

public class NorwegianParrot extends Parrot {
    protected NorwegianParrot(final int numberOfCoconuts, final double voltage, final boolean isNailed) {
        super(numberOfCoconuts, voltage, isNailed);
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
