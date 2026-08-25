package Glava_2.Task_2_1_9;

import java.util.Objects;

public class Complex {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        System.out.println(a.equals(b));
        System.out.println(b.equals(a));
        System.out.println(a.hashcode());
        System.out.println(b.hashcode());

    }
    public static class ComplexNumber {
        private double re;
        private double im;

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }

        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            ComplexNumber c = (ComplexNumber) o;
            if (Double.compare(c.re, re) != 0) return false;
            if (Double.compare(c.im, im) != 0) return false;
            return true;
        }

        public int hashcode() {
            int result = 31;
            return result ^ Objects.hash(im, re);

        }
    }
}
