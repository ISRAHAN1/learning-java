package Glava_1.Task_1_6_12_;
public class TextR {
    public static void main(String[] args) {
        String[]roles=new String[]{"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
        String[]textLines=new String[]{"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий:Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
        };
        System.out.print(printTextPerRole(roles,textLines));
    }
    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder stringBuilderOut = new StringBuilder();
        for (int i = 0; i < roles.length; i++) {
            stringBuilderOut.append(roles[i]).append(":").append('\n');
            for (int j = 0; j < textLines.length; j++) {
                String result = textLines[j];
                if (result.startsWith(roles[i])) {
                    String string1 = result.replaceFirst(roles[i] + ":", String.valueOf(j+1 ) + ")");
                    stringBuilderOut.append(string1).append('\n');
                }
            }
            stringBuilderOut.append('\n');
        }
        return String.valueOf(stringBuilderOut);
    }


}
