package Glava_4.Task_4_4_9;
import java.util.logging.Logger;

import static Glava_4.Task_4_4_9.Main.AUSTIN_POWERS;

public class Spy implements MailService{
    private Logger LOGGER;
    public Spy(Logger LOGGER){
        this.LOGGER=LOGGER;
    }
    @Override
    public SendAble processMail(SendAble mail) {
        if(mail.getClass()== MailMessage.class){
            MailMessage mailMessage = (MailMessage) mail;
            String from = mailMessage.getFrom();
            String to = mailMessage.getTo();
            if(from.equals(AUSTIN_POWERS) ||to.equals(AUSTIN_POWERS)){
                LOGGER.warning("\"Detected target mail correspondence: from " + from + " to " + to + "message"+ mailMessage.getMessage());
            }else{
                LOGGER.info(("Usual correspondence: from " + from + " to " + to +""));
            }
        }
        return mail;
    }
}
