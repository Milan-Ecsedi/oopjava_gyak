package hu.petrik.helloworld_14S;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        ember e1= new ember("Gipsz jakab", "1988-1-12","Budapest");
        ember e2= new ember("Teszt Elek", "2003-12-5","Debrecen");
        ember e3= new ember("Kovács Béla", "1973-9-22","Pécs");
        ember e4= new ember("Bom Ádám", "1999-3-18","Dabas");
        ember e5= new ember("Jézus Krisztina", "1000-11-30","Afrika");

        ember[] emberTomb= new ember[]{e1,e2,e3,e4,e5};
        emberek ek= new emberek(emberTomb);
        String fajlNev="emberek.txt";

        try {
            emberek ek2= new emberek(fajlNev);
            System.out.println(ek2);
        }

        catch (FileNotFoundException e) {
            System.out.printf("A(z) %s nem található" , fajlNev);;
        }
        catch (IOException e)

        {
            System.out.println("Ismeretlen hiba történt");
        }


    }
}
