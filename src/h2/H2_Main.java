package h2;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class H2_Main {

    public static void main(String[] args) {

        Mail mail1 = new Mail(
                "Timo@gmail.de",
                "Hausaufgaben",
                "Hello there!",
                LocalDateTime.now()
        );


        Mail mail2 = new Mail(
                "Laura@gmail.de",
                "School",
                "Bye bye!",
                LocalDateTime.now()
        );

        Mail mail3 = new Mail(
                "Leona@gmail.de",
                "Monday",
                "Miau",
                LocalDateTime.now()
        );

        Mail mail4 = new Mail(
                "Luisa@gmail.de",
                "Info",
                "Blablabla",
                LocalDateTime.now()
        );

        mail1.seen();
        mail3.seen();

        Inbox inbox = new Inbox();

        inbox.addMail(mail1);
        inbox.addMail(mail2);
        inbox.addMail(mail3);
        inbox.addMail(mail4);

        System.out.println(inbox.countUnread());


        //lesen von Mail
        inbox.open(1);
        System.out.println(inbox.countUnread());

        //test ob outofbound funktioniert
        inbox.open(4);
        System.out.println(inbox.countUnread());
    }
}