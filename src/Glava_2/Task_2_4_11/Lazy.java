package Glava_2.Task_2_4_11;

public class Lazy {

    public static class Student {
        protected final String studying;

        protected Student(String work) {
            this.studying = work;
        }

        public Student() {
            this.studying = "прохожу курс по Java";
        }

        public void study() {
            System.out.println("Я очень занят " + studying);
        }
    }

    public static class LazyStudent extends Student {
        protected final String studying;

        public LazyStudent() {
            super();
            this.studying = "Cегодня не учусь,мне лень";
        }

        @Override
        public void study() {
            System.out.println(studying);
        }
    }
}

