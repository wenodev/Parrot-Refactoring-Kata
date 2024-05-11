package parrot;

import static parrot.ParrotTypeEnum.NORWEGIAN_BLUE;

public class NorwegianParrot extends Parrot {
    protected NorwegianParrot(final int numberOfCoconuts, final double voltage, final boolean isNailed) {
        super(NORWEGIAN_BLUE, numberOfCoconuts, voltage, isNailed);
    }

    @Override
    protected double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
    }

    @Override
    public String getCry() {
        return switch (type) {
            case EUROPEAN -> "Sqoork!";
            case AFRICAN -> "Sqaark!";
            case NORWEGIAN_BLUE -> voltage > 0 ? "Bzzzzzz" : "...";
        };
    }
}
