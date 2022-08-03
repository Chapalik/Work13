package ithillel.ua.devices;

import ithillel.ua.interfaces.Caller;
import ithillel.ua.interfaces.EmailSender;

public class SmartPhone extends Mobile implements Caller, EmailSender {
    public void runApp() {
        System.out.println("Заходим в меню, запускаем нужное приложение");
    }


    public String editMail(String mail) {
        System.out.println("Ваше письмо с текстом " + mail + " изменено");
        return new String("измененны текст письма");
    }


    public String createMail(String mail) {
        System.out.println("Ваше письмо с текстом " + mail + " создано и готово к отправке");
        return new String("Готовое " + mail);
    }


    public void sendMail() {
        System.out.println("Письмо отправлено");
    }
}
