package ithillel.ua.abstractModel;

public abstract class AbstractDevice {
    private String name;
    private int serialNumber;

    public AbstractDevice() {
        powerOn();
    }

    public abstract void powerOn();

    public abstract void powerOff();
}
