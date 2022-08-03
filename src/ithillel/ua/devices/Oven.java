package ithillel.ua.devices;

import ithillel.ua.abstractModel.Multicook;

public class Oven extends Multicook {

    public void initTimer(int time) {
        System.out.println("Ваши супы будут жарится аж " + time + " минут");
    }

    public void cook() {
        System.out.println("Мы начинаем быстро жарить сразу несколько супов");
    }
}
