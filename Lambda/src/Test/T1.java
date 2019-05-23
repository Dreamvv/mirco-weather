package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T1 {

    public static void main(String[] args) {
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};

        List<String> players =  Arrays.asList(atp);

        List<String> list = new ArrayList<>();
        list.add("aa");list.add("bb");list.add("cc");

// 以前的循环方式
        for (String player : players) {
            System.out.print(player + "; ");
        }
        System.out.println();

        for (String string : list){
            System.out.print(string+",");
        }


        players.forEach((player) -> System.out.print(player+";"));
    }
}
