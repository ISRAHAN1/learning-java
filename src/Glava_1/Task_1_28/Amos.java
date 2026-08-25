package Glava_1.Task_1_28;

public class Amos {
    public static void main(String[] args) {
        String[] roles = new String[]{"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
        String[] text = new String[]{"Городничий:Я пригласил вас господа с тем чтобы сообщить вам неприятное известие:  к нам едет ревизор",
                "Аммос Федорович:Как ревизор?",
                "Артемий Филиппович:Как ревизор?",
                "Городничий: Ревизор из Петербурга,инкогнито.И еще с секретным предптсаньем",
                "Аммос Федорович:вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже!еще и с секретным предписанием!"};

        System.out.println(printTextRole(roles, text));
    }

    public static String printTextRole(String[] roles, String[] text) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String role : roles) {
            stringBuilder.append(role).append(":").append('\n');
            for (int j = 0; j < text.length; j++) {
                String result = text[j];
                if (result.startsWith(role)) {
                    String string1 = result.replaceFirst(role + ":", (j + 1 + ")"));
                    stringBuilder.append(string1).append('\n');
                }
            }
            stringBuilder.append('\n');
        }
        return String.valueOf(stringBuilder);
    }
}
