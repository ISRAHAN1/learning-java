package Glava_4.Task_4_4_9;

public class UntrustworthyMailWorker implements MailService{
    private final RealMailService realMailService =new RealMailService();
    private final MailService[] mailServices;

    public UntrustworthyMailWorker( MailService[] services) {
        this.mailServices = services;
    }
    @Override
    public SendAble processMail(SendAble mail) {
        for(MailService mailService:mailServices){
            mail=mailService.processMail(mail);
        }
        return realMailService.processMail(mail);
    }
    public RealMailService getRealMailService(){
        return realMailService;
    }
}