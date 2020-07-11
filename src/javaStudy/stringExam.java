package javaStudy;

public class stringExam {
    public static void main(String[] args) {
        String s1 = "hello world";
        String s2 = s1.substring(5);
        System.out.println(s1);
        System.out.println(s2);

        String s3 = s1 + s2;
        System.out.println(s3);

        String s4 = new StringBuffer().append(s1).append(s2).toString();
        System.out.println(s4);

        String s5 = "";
        // 느림 쓰레기 코드
        for(int i = 0; i < 100; i++)
        {
            s5 = s5 + "*";
        }
        System.out.println(s5);

        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < 100; i++)
        {
            sb.append("*"); // 이래야 빠름
        }
        String s6 = sb.toString();
        System.out.println(s6);
    }
}
