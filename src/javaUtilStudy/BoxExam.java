package javaUtilStudy;

public class BoxExam {

    public static void main(String[] args) {
//        Box box = new Box();
//        box.setObj(new Object());
//        Object obj = box.getObj();
//
//        box.setObj("hello");
//        String s = box.getObj().toString();
//        System.out.println(s);
//
//        box.setObj(1);
//        int a = (int)box.getObj();

        Box<Object> box = new Box<>();
        box.setObj(123);
        Object obj = box.getObj();

        Box<String> box2 = new Box<>();
        box.setObj("hello");

    }
}
