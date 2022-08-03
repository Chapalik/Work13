package ithillel.ua.devices;

import ithillel.ua.abstractModel.Multicook;

public class Multicooker extends Multicook {

    public void switchProgram(int numberOfProgram) {
        System.out.println("Вы выбрали " + numberOfProgram + " программу для жарки батиного супа");
    }


    public void cook() {
        System.out.println("Мы начинаем медленно жарить ваш суп");
    }
}
