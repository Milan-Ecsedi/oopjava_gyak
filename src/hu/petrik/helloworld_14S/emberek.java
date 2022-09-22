package hu.petrik.helloworld_14S;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class emberek {

    private List<ember> Emberek;


    public emberek(ember[] emberTomb) {

      this.Emberek=new ArrayList<>();
        this.Emberek.addAll(Arrays.asList(emberTomb));


    }
    @Override
    public String toString(){
        StringBuilder s= new StringBuilder(String.format("%30s %10s (%3s év) %20s", "Név", "Szül.dátum", "Kor", "Szül.hely"));
        for (int i=0; i< this.Emberek.size(); i++){

            s.append(System.lineSeparator()).append(this.Emberek.get(i));



        }
        return s.toString();


    }
    public emberek(String fajlNev) throws IOException {

        this.Emberek=new ArrayList<>();
        FileReader fr = new FileReader(fajlNev);
        BufferedReader br=new BufferedReader(fr);
        String sor=br.readLine();

        while (sor != null && !sor.equals("")){

         String[] adatok=  sor.split(";");

         ember Ember =new ember(adatok[0],adatok[1],adatok[2]) ;
         this.Emberek.add(Ember);

            sor=br.readLine();

        }

        br.close();
        fr.close();

    }

}
