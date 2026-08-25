package Glava_2.Task_2_3_11.Home;
public class Human {
    public static void main(String[]args){
        Human s= new Human("0001","вчера было прохладно ", "я уже создавал ", "я рассказал про них");
        System.out.println(s.getExperience());
        System.out.println(s.getSecret());

    }
    private final String secret;
    private final String news;
    private final String experience;
    private final String gossip;

    public Human(String secret,String news, String experience, String gossip) {
        this.secret = secret;
        this.news=news;
        this.experience=experience;
        this.gossip=gossip;
    }
    private String getSecret(){
        return secret;
    }
    public String getNews() {
        return news;
    }
    protected String getExperience(){
        return experience;
    }
    String getGossip(){
        return gossip;
    }
}
