package javaStudy;

public class WrapperExam {

    public static void main(String[] args) {
        int i = 5;
        Integer i2 = new Integer(5);
        Integer i3 = new Integer(5);
        // java 5부터 auto boxing

        int i4 = i3.intValue();
        int i5 = i3;
        // auto unboxing
    }
}
