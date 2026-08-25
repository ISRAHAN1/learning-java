package Glava_2.Task_2_5_7;

import static Glava_2.Task_2_5_7.TooLongTextAnalyzer.checkLabels;

public class Find {
    private static String[] spamWords = {"shit", "ass", "fuck"};
    private static int maxLength = 200;
    public static void main(String[] args) {
        String text = "ffassasf:(";
        TextAnalyzer[] textAnalyzers = {new SpamAnalyzer(spamWords), new NegativeTextAnalyzer(), new TooLongTextAnalyzer(maxLength)};
        System.out.println(checkLabels(textAnalyzers,text));
    }
}
