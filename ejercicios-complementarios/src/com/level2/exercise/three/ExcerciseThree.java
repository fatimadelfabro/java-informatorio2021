package com.level2.exercise.three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExcerciseThree {
    public static void main (String [] args){
        List<Integer> frenchPlaying = new ArrayList<Integer>();

        for (int i = 0; i < 14; i++) {
            frenchPlaying.add(i+1);
        }
        System.out.println("Ordered playing cards --> " + frenchPlaying);

        Collections.reverse(frenchPlaying);
        System.out.println("Cards in reverse order --> " + frenchPlaying);

        Collections.shuffle(frenchPlaying);
        System.out.println("Disordered playing cards --> " + frenchPlaying);



    }
}
