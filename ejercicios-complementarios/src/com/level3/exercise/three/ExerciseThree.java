package com.level3.exercise.three;
import java.util.List;

public class ExerciseThree {
    public static void main (String [] args){
        List<String> words = List.of("Blue", "red", "blue", "Green", "BLACK");
        int letterB = (int) words.stream().filter(letter -> letter.toLowerCase().startsWith("b")).count();
        System.out.println(letterB);
    }
}