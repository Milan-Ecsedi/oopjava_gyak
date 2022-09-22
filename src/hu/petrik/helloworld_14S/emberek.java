package hu.petrik.helloworld_14S;

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
}
