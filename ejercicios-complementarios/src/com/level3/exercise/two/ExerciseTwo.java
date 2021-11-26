package com.level3.exercise.two;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciseTwo {
    public static void main (String [] args){
        List<Integer> num = List.of(1,2,3,4,5);
        List<Long> pow = num.stream().map(n -> Math.round(Math.pow(n, 2))).collect(Collectors.toList());
        System.out.println(pow);
    }
}
