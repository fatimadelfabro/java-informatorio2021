package com.level2.exercise.five;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExerciseFive {
    public static void main (String [] args){
        List<Integer> hoursWorked = new ArrayList<Integer>();
        List<Integer> hourValue = new ArrayList<Integer>();
        List<Integer> totalValue = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int acum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter how many hours I work on day " + (i+1));
            hoursWorked.add(sc.nextInt());
            System.out.println("Enter the hour value");
            hourValue.add(sc.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            totalValue.add(hoursWorked.get(i)*hourValue.get(i));
            acum = acum+totalValue.get(i);
        }

        System.out.println("Total value for each day worked -> " + totalValue);
        System.out.println("Total: $" + acum);
    }
}