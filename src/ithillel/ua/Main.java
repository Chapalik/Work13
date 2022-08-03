package ithillel.ua;

import ithillel.ua.abstractModel.AbstractDevice;
import ithillel.ua.devices.*;
import ithillel.ua.interfaces.MailSender;

public class Main {
    public static void main(String[] args) {

        DIalPhone dIalPhone = new DIalPhone();

        dIalPhone.call();
        dIalPhone.autoAnswer();


        Mobile mobile = new Mobile();

        mobile.call();


        SmartPhone smartPhone = new SmartPhone();
        smartPhone.call();
        smartPhone.runApp();


        Oven oven = new Oven();

        oven.initTimer(60);
        oven.cook();


        Multicooker multicooker = new Multicooker();

        multicooker.switchProgram(42);
        multicooker.cook();


        Post post = new Post();
        post.createMail("пост");
        post.sendMail();
        AbstractDevice[] deviceArr = new AbstractDevice[5];
        deviceArr[0] = dIalPhone;
        deviceArr[1] = mobile;
        deviceArr[2] = multicooker;
        deviceArr[3] = oven;
        deviceArr[4] = smartPhone;

        MailSender[] mailArr = new MailSender[1];
        mailArr[0] = post;

        offAll(deviceArr);

        sendAll(mailArr);


    }

    private static void sendAll(MailSender[] varargs) {
        for (int i = 0; i < varargs.length; i++) {
            varargs[i].sendMail();
        }
    }


    private static void offAll(AbstractDevice[] varargs) {
        for (int i = 0; i < varargs.length; i++) {
            varargs[i].powerOff();
        }
    }
}