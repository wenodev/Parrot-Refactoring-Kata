package parrot;

public class NorwegianParrot extends Parrot {

    protected NorwegianParrot(final double voltage, final boolean isNailed) {
        super(voltage, isNailed);
    }

    @Override
    public double getSpeed() {
        return isNailed ? 0 : Math.min(24.0, voltage * getBaseSpeed());
    }

    @Override
    public String getCry() {
        return voltage > 0 ? "Bzzzzzz" : "...";
    }
}
