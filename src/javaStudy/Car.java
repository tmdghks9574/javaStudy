package javaStudy;

import java.lang.*;

public class Car {

    String name;
    String number;
    int year;

    public String toString() {
        return "name: " + name + ", number: " + number;
    }
    public static void main(String[] args) throws Exception {
        Car c1 = new Car();
        c1.name = "람보르기니";
        c1.number = "1234";
        c1.year = 3;

        Car c2 = new Car();
        c2.name = "람보르기니";
        c2.number = "1234";
        c2.year = 4;

        if(c1.name.equals(c2.name))
            System.out.println("fuck");
        else
            System.out.println("sibal");


        System.out.println(c1);
        System.out.println(c2.toString());

    }

}
