package javaStudy;

import java.util.*;
import java.math.*;
import java.io.*;

public class StringBufferStudy {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        sb.append("hello");
        sb.append(" ");
        sb.append("world");

        String str = sb.toString();
        System.out.println(str);

        StringBuffer sb2 = new StringBuffer();
        StringBuffer sb3 = sb2.append("hello");
        //메소드 체이닝

        if(sb2.equals(sb3))
            System.out.println("sibal");

        String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();

        System.out.println(str2);
    }
}
