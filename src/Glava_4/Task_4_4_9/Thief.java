package Glava_4.Task_4_4_9;

public class Thief implements MailService{
    private int min=0;
    private int stolenPrice = 0;
    public Thief(int min){
        this.min=min;
    }
    public int getStolenPrice(){
        return stolenPrice;
    }

    @Override
    public SendAble processMail(SendAble mail) {
        if(mail.getClass()== MailPackage.class){
            Package pack=((MailPackage) mail).getContent();
            if(pack.getPrice()>=min){
                stolenPrice=stolenPrice+ pack.getPrice();
                mail = new MailPackage(mail.getFrom(), mail.getTo(),new Package("stones instead of " + pack.getContent(), 0));

            }
        }
        return mail;
    }
}
