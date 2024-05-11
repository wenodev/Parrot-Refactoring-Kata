package parrot;

public class EuropeanParrot extends Parrot {

    public EuropeanParrot(final double voltage, final boolean isNailed) {
        super();
    }

    @Override
    public double getSpeed() {
        return getBaseSpeed();
    }

    @Override
    public String getCry() {
        return "Sqoork!";
    }
}
