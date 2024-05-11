package parrot;

public class NorwegianParrot extends Parrot {
    protected NorwegianParrot(final int numberOfCoconuts, final double voltage, final boolean isNailed) {
        super(ParrotTypeEnum.NORWEGIAN_BLUE, numberOfCoconuts, voltage, isNailed);
    }

    @Override
    public double getSpeed() {
        return switch (type) {
            case EUROPEAN -> getBaseSpeed();
            case AFRICAN -> Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
            case NORWEGIAN_BLUE -> (isNailed) ? 0 : getBaseSpeed(voltage);
        };
    }
}
