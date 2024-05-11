package parrot;

public class AfricanParrot extends Parrot {
    protected AfricanParrot(final int numberOfCoconuts, final double voltage, final boolean isNailed) {
        super(ParrotTypeEnum.AFRICAN, numberOfCoconuts, voltage, isNailed);
    }
}
