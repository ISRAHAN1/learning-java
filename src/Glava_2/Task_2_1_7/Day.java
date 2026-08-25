package Glava_2.Task_2_1_7;
public enum Day {
    MONDAY("Понедельник", false),
    TUESDAY("Вторник", false),
    WEDNESDAY("Среда", false),
    THURSDAY("Четверг", false),
    FRIDAY("Пятница", false),
    SATURDAY("Суббота", true),
    SUNDAY("Воскресенья", true);

    private String name;
    private boolean result;

    Day(String name, boolean result) {
        this.name = name;
        this.result = result;
    }

    public boolean isWeekend() {
        return result;
    }

    public String getRusName() {
        return name;
    }
}

