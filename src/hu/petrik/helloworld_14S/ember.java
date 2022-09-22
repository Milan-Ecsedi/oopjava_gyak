package hu.petrik.helloworld_14S;

public class ember {
     private String nev;
     private String SzulDatum;
     private String SzulHely;

    public ember(String nev, String szulDatum, String szulHely) {
        this.nev = nev;
        SzulDatum = szulDatum;
        SzulHely = szulHely;
    }

    public int getSzuletesEv(){

        return Integer.parseInt( this.SzulDatum.substring(0,4));


    }

    public int getSzuletesiHonap(){

        String[] szuletesiAdatok=this.SzulDatum.split("-");
        return Integer.parseInt(szuletesiAdatok[1]);

    }
    public int getSzuletesiNap(){

        String[] szuletesiAdatok=this.SzulDatum.split("-");
        return Integer.parseInt(szuletesiAdatok[2]);

    }

    @Override
    public String toString() {
        return String.format("%30s %10s %20s", this.nev,this.SzulDatum,this.SzulHely);
    }



}
