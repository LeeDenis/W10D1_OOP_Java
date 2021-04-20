package com.tts;

import static com.tts.Calculator.*;
import static com.tts.MagicCalculator.*;


public class Main {

    public static void main(String[] args) {
        System.out.println("=====Pet One=====");
        Pet pet1 = new Pet();
        pet1.setName("Kratos");
        pet1.setAge(5);
        pet1.setLocation("House");
        pet1.setType("Dog");
        System.out.println(pet1.getName());
        System.out.println(pet1.getAge());
        System.out.println(pet1.getLocation());
        System.out.println(pet1.getType());

        System.out.println("=====Pet Two=====");
        Pet pet2 = new Pet();
        pet1.setName("Chloe");
        pet1.setAge(11);
        pet1.setLocation("Bedroom");
        pet1.setType("Cat");
        System.out.println(pet2.getName());
        System.out.println(pet2.getAge());
        System.out.println(pet2.getLocation());
        System.out.println(pet2.getType());

        System.out.println("=====Holiday One=====");
        Holiday holiday1 = new Holiday();
        holiday1.setHoliday("Halloween");
        holiday1.setMonth("October");
        holiday1.setLocation(31);
        holiday1.setFederal(false);
        System.out.println(holiday1.getHoliday());
        System.out.println(holiday1.getMonth());
        System.out.println(holiday1.getDay());
        System.out.println("Federal Holiday?: " + holiday1.getFederal());

        System.out.println("=====Holiday Two=====");
        Holiday holiday2 = new Holiday();
        holiday2.setHoliday("Independence Day");
        holiday2.setMonth("July");
        holiday2.setLocation(4);
        holiday2.setFederal(true);
        System.out.println(holiday2.getHoliday());
        System.out.println(holiday2.getMonth());
        System.out.println(holiday2.getDay());
        System.out.println("Federal Holiday?: " + holiday2.getFederal());

        System.out.println("=====Calculator=====");
        int x = 21;
        int y = 8;
        int z = add(x,y);
        System.out.println("The sum of " + x + " and " + y + " is " + z + ".");

        int a = 23;
        int b = 58;
        int c = subtract(a,b);
        System.out.println("The difference between " + a + " and " + b + " is " + c + ".");

        int d = 17;
        int e = 48;
        int f = multiply(d,e);
        System.out.println("The product of " + d + " and " + e + " is " + f + ".");

        int g = 48;
        int h = 7;
        int i = divide(g,h);
        System.out.println("The quotient between " + g + " and " + h + " is " + i + ".");

        int j = 23;
        int k = square(j);
        System.out.println("The square of " + j + " is " + k + ".");


        System.out.println("=====Magic Calculator=====");
        int l = 64;
        sqrt(l);

        int m = 23;
        sin(m);

        int n = 48;
        cos(n);

        int o = 98;
        tan(o);

        int p = 11;
        factorial(p);

    }


}
