package parrot;

import static parrot.ParrotTypeEnum.AFRICAN;

public class AfricanParrot extends Parrot {
    protected AfricanParrot(final int numberOfCoconuts, final double voltage, final boolean isNailed) {
        super(AFRICAN, numberOfCoconuts, voltage, isNailed);
    }

    @Override
    protected double getSpeed() {
        return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
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
