package hu.petrik.helloworld_14S;

public class Main {

    public static void main(String[] args) {

        ember e1= new ember("Gipsz jakab", "1988-1-12","Budapest");
        ember e2= new ember("Teszt Elek", "2003-12-5","Debrecen");
        ember e3= new ember("Kovács Béla", "1973-9-22","Pécs");

        System.out.println(e1+" "+ e1.getSzuletesEv());
        System.out.println(e2+" "+ e2.getSzuletesiHonap());
        System.out.println(e3+" "+ e3.getSzuletesiNap());

    }
}
