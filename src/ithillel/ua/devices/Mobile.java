package ithillel.ua.devices;

import ithillel.ua.abstractModel.Phone;

public class Mobile extends Phone {

    public void call() {
        System.out.println("Выбираем контакт из меню,звоним - але? где деньги хайлельски?");
    }


    public void powerOn() {
        System.out.println("Зажимаем кнопку включения. Мобильный телефон запускается.");
    }


    public void powerOff() {
        System.out.println("Зажимаем кнопку включения. Мобильный телефон выключается");
    }
}
