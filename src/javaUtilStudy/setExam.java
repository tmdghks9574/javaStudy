package javaUtilStudy;

import java.util.*;
import java.math.*;
import java.io.*;

public class setExam {

    public static void main(String[] args) {
        Set<String> s1 = new HashSet<>(); //비순차
        Set<String> s2 = new TreeSet<>(); //자동정렬
        s2.add("abc");
        s2.add("zzz");
        s2.add("gfd");
        boolean a = s1.add("hello");
       boolean b = s1.add("world");
       //boolean c =  s1.add("hello");
       // add 는 반환 true or false
       System.out.println(a + " " + b + " ");
       Iterator<String> iter = s2.iterator();
       for(int i = 0; i < s2.size(); i++)
           System.out.println(iter.next());
    }
}
