package parrot;

import static parrot.ParrotTypeEnum.NORWEGIAN_BLUE;

public class NorwegianParrot extends Parrot {
    protected NorwegianParrot(final int numberOfCoconuts, final double voltage, final boolean isNailed) {
        super(NORWEGIAN_BLUE, numberOfCoconuts, voltage, isNailed);
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
