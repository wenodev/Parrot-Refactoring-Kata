package parrot;

import static parrot.ParrotTypeEnum.AFRICAN;

public class AfricanParrot extends Parrot {
    protected AfricanParrot(final int numberOfCoconuts, final double voltage, final boolean isNailed) {
        super(AFRICAN, numberOfCoconuts, voltage, isNailed);
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
