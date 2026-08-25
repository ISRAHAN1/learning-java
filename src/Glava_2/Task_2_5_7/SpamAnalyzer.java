package Glava_2.Task_2_5_7;

public class SpamAnalyzer extends KeywordAnalyzer {
    private final String[] keywords;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }
    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }
    @Override
    protected String[] getKeywords() {
        return keywords;
    }

}
