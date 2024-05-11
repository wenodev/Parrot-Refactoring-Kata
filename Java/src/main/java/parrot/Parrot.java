package parrot;

public abstract class Parrot {

    protected final ParrotTypeEnum type;
    protected final int numberOfCoconuts;
    protected final double voltage;
    protected final boolean isNailed;

    protected Parrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public static Parrot createParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        Parrot parrot;
        switch (type) {
            case EUROPEAN -> {
                parrot = new EuropeanParrot(numberOfCoconuts, voltage, isNailed);
            }
            case AFRICAN -> {
                parrot = new AfricanParrot(numberOfCoconuts, voltage, isNailed);
            }
            case NORWEGIAN_BLUE -> {
                parrot = new NorwegianParrot(numberOfCoconuts, voltage, isNailed);
            }
            default -> throw new IllegalArgumentException("Can not arrange");
        }
        return parrot;
    }

    public abstract double getSpeed();

    protected double getBaseSpeed() {
        return 12.0;
    }

    public abstract String getCry();
}
