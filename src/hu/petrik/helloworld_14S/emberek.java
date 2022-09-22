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
}
