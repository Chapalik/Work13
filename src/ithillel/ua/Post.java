package ithillel.ua;

import ithillel.ua.interfaces.MailSender;

public class Post implements MailSender {

    public String createMail(String mail) {
        System.out.println("Ваш пост с текстом " + mail + " создано и готово к отправке");
        return new String("Готовый " + mail);
    }

    public void sendMail() {
        System.out.println("Пост отправлен");
    }
}
