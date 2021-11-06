package com.level1.exercise.eight;
import java.util.Scanner;

public class ExerciseEight {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String name_and_surname, age, direction, city;

        System.out.println("Enter your personal data");
        System.out.println("Name and Surname: ");
        name_and_surname = sc.nextLine();
        System.out.println("Age: ");
        age = sc.nextLine();
        System.out.println("Direction: ");
        direction = sc.nextLine();
        System.out.println("City: ");
        city = sc.nextLine();

        System.out.println("Your personal information: ");
        System.out.println(city + " - " + direction + " - " + age + " - " + name_and_surname);
    }
}
