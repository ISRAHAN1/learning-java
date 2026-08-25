package Glava_2.Task_2_4_9;

public class Students {
    public static class Student {
        protected final String studying;

        protected Student(String work) {
            this.studying = work;
        }

        public Student() {
            this.studying = "прохожу тестовое задание";
        }

        public void study() {
            System.out.println("Я очень занят " + studying);
        }
    }

    public static class JavaStudent extends Student {
        protected final String studying;

        public JavaStudent() {
            super();
            this.studying = "Прохожу курс по java";
        }

        public void study() {
            System.out.println("я очень занят," + studying);

        }
    }
}
