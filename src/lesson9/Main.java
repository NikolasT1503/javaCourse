package lesson9;

import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero(1,"Max", 0,0, 5, 5);
        Hero h2 = new Hero("2","Nikolas", 0,0, 5, 5);
        Archer a = new Archer(3,"Legolas", 0,0, 2);
        System.out.println(h1.equals(h2));
        System.out.println(h1.getClass());
        System.out.println(h1.hashCode());
        //System.out.println(h1.toString());

        try {
            Hero h3=h1.clone();
            System.out.println(h1.getName());
            h3.setName("Nikolas");
            System.out.println(h3);
            System.out.println(h3.getName());
            System.out.println(h1.getName());
        } catch (CloneNotSupportedException ex) {
            System.out.println(ex.getMessage());

        }

        h1.compareTo(h2);

        Printer<Hero> he = new Printer<>(h1);
        System.out.println(he.printHero());

        Printer<Hero> he2 = new Printer<>(h2);
        System.out.println(he2.printHero());

        Printer<Archer> ap = new Printer<>(a);
        System.out.println(ap.printHero());

    }


}





