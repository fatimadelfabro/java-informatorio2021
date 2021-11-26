package com.level3.exercise.four;

import java.util.List;
import java.util.stream.Collectors;

public class ExerciseFour {
    public static void main(String [] args){
        List<Integer> num = List.of(1, 2, 4, 4, 4);
        List<Integer> listFactorial = num.stream().distinct().map(n -> factorial(n)).collect(Collectors.toList());
        System.out.println(listFactorial);
    }
    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
