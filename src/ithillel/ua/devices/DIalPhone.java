package ithillel.ua.devices;

import ithillel.ua.abstractModel.Phone;
import ithillel.ua.interfaces.Caller;

public class DIalPhone extends Phone implements Caller {

    public void autoAnswer(){
        System.out.println("Нет на месте, оставьте сообщение");
    }

    public void powerOn() {
        System.out.println("Одобрительный звон включеного домашнего телефона при подключении к сети");
    }


    public void powerOff() {
        System.out.println("Неодобрительно предсмертное пищание выключеного домашнего телефона при отключении от сети");
    }

    public void call() {
        System.out.println("Поднимакем трубку, набираем номер - Але это кто? Это вы мне звоните");
    }
}
