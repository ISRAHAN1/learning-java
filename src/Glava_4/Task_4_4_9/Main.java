package Glava_4.Task_4_4_9;

import java.util.logging.Logger;

public class Main {
    public static final String AUSTIN_POWERS = "Austin Powers";
    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";
    public static void main(String[]args) {
        MailService spy = new Spy(Logger.getLogger(Class.class.getName()));
        Thief thief = new Thief(10);
        MailService inspector = new Inspector();
        MailService[]mailServices=new MailService[]{spy,thief,inspector};
        MailMessage mail1 = new MailMessage("Romeo", "Juliet", "I love you!");
        MailMessage mail2 = new MailMessage("Austin Powers", "James Bond", "Big secret!");
        MailPackage mail3 = new MailPackage("Romeo", "Juliet", new Package("Flowers", 55));
        MailPackage mail4 = new MailPackage("Romeo", "Juliet", new Package("Flowers", 55));
        MailPackage mail5 = new MailPackage("Austin Powers", "James Bond", new Package("weapons", 6));

        UntrustworthyMailWorker umw = new UntrustworthyMailWorker(mailServices);
        try {
            umw.processMail(mail1);
        } catch (RuntimeException re) {
            System.out.println(re.getMessage());
        }
        try {
            umw.processMail(mail2);
        } catch (RuntimeException re) {
            System.out.println(re.getMessage());
        }
        try {
            umw.processMail(mail3);
        } catch (RuntimeException re) {
            System.out.println(re.getMessage());
        }
        try {
            umw.processMail(mail4);
        } catch (RuntimeException re) {
            System.out.println(re.getMessage());
        }
        try {
            umw.processMail(mail5);
        } catch (RuntimeException re) {
            System.out.println(re.getMessage());
        }

        System.out.println("Thief have stolen $" + thief.getStolenPrice() + "!");
    }
    }


