package parrot;

public enum ParrotTypeEnum {

    EUROPEAN,
    AFRICAN,
    NORWEGIAN_BLUE;

    public static Parrot createParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        Parrot parrot;
        switch (type) {
            case EUROPEAN -> parrot = new EuropeanParrot(voltage, isNailed);
            case AFRICAN -> parrot = new AfricanParrot(numberOfCoconuts, voltage, isNailed);
            case NORWEGIAN_BLUE -> parrot = new NorwegianParrot(voltage, isNailed);
            default -> throw new IllegalArgumentException("Should be unreachable");
        }
        return parrot;
    }
}
