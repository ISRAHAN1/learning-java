package Glava_2.Task_2_5_7;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
    private final String[] keywords = {":(", ":|", "=("};

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
    @Override
    protected String[] getKeywords() {
        return keywords;
    }


}
