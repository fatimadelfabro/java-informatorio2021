package com.level2.exercise.seven;
import java.util.ArrayList;

public class ExerciseSeven {
    public static void main(String [] args){
        System.out.println(fizzBuzzFunction(1,6));
        System.out.println(fizzBuzzFunction(1,8));
    }
    public static ArrayList<String> fizzBuzzFunction(int value1, int value2){
        ArrayList<String> fizzBuzz = new ArrayList<String>();
        for (int i = value1; i < value2; i++) {
            fizzBuzz.add((Integer.toString(i)));
        }
        int aux;
        for (int i = 0; i < fizzBuzz.size(); i++) {
            aux = Integer.parseInt(fizzBuzz.get(i));
            if (aux % 2 == 0 && aux % 3 == 0){
                fizzBuzz.set(i,"FizzBuzz");
            }else if (aux % 2 == 0){
                fizzBuzz.set(i,"Fizz");
            }else if (aux % 3 == 0){
                fizzBuzz.set(i, "Buzz");
            }
        }
        return fizzBuzz;
    }
}
