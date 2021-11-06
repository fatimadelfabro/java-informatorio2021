package com.level2.exercise.four;
import java.util.ArrayList;
import java.util.List;

public class ExerciseFour {
    public static void main (String [] args){
        List<String> listNames = new ArrayList<String>();
        listNames.add("Del Fabro Fátima");
        listNames.add("Mendez Clara");
        listNames.add("Torres Mariano");
        listNames.add("Cardozo Carlos");
        listNames.add("Lezcano Daniela");
        listNames.add("Cabrera Teresa");
        listNames.add("Lopéz Agustin");
        listNames.add("Martinez Tamara");
        listNames.add("Mendez Delfina");
        listNames.add("Perez Dante");
        listNames.add("Garcia Melisa");
        listNames.add("Santos Antonio");

        List<String> courseFirst = listNames.subList(0,4);
        List<String> courseSecond = listNames.subList(4,8);
        List<String> courseThird = listNames.subList(8,12);

        System.out.println("Course 1: " + courseFirst);
        System.out.println("Course 2: " + courseSecond);
        System.out.println("Course 3: " + courseThird);
    }
}