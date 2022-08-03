package ithillel.ua.abstractModel;

public abstract class Multicook extends AbstractDevice {
    public abstract void cook();

    public void powerOn() {
        System.out.println("Подключаем печь в сеть, наслаждаемся процессом ");
    }

    public void powerOff() {
        System.out.println("Выключаем печь из сети");
    }
}


