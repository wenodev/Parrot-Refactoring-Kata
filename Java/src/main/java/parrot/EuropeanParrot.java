package parrot;

public class EuropeanParrot extends Parrot {
    public EuropeanParrot(final ParrotTypeEnum type, final int numberOfCoconuts, final double voltage, final boolean isNailed) {
        super(ParrotTypeEnum.EUROPEAN, numberOfCoconuts, voltage, isNailed);
    }
}
