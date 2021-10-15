package com.level2.exercise.two;

import java.util.ArrayList;

public class ExerciseTwo {
    public static void main (String [] args){

        ArrayList<Integer> listNumber = new ArrayList<>();

        listNumber.add(20);
        listNumber.add(21);
        listNumber.add(22);
        listNumber.add(23);
        listNumber.add(24);

        System.out.println("Initial List");
        for (int i = 0; i < listNumber.size(); i ++){
            System.out.println(i+1 + "-->" + listNumber.get(i));
        }
        System.out.println("List size: " + listNumber.size());
        listNumber.add(0, 1);

        System.out.println("Add to the beginning of the list");
        for (int i = 0; i < listNumber.size(); i ++){
            System.out.println(i+1 + "-->" + listNumber.get(i));
        }
        System.out.println("List size: " + listNumber.size());

        listNumber.add(99);
        System.out.println("Add to the end of the list");
        for (int i = 0; i < listNumber.size(); i ++){
            System.out.println(i+1 + "-->" + listNumber.get(i));
        }
        System.out.println("List size: " + listNumber.size());

    }
}