package parrot;

public abstract class Parrot {

    protected final double voltage;
    protected final boolean isNailed;

    protected Parrot(double voltage, boolean isNailed) {
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public abstract double getSpeed();

    protected double getBaseSpeed() {
        return 12.0;
    }

    public abstract String getCry();
}
