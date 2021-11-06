package com.level2.exercise.six;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ExerciseSix {
    public static void main (String [] args){
        Set<Employee> employees = new HashSet<Employee>();
        Map<Integer, Double> salary = new HashMap<Integer, Double>();

        Employee e1 = new Employee("Maria", "Garcia", 46123001, 8, 500);
        Employee e2 = new Employee("Teresa", "Lopez", 40123112, 10, 520);
        Employee e3 = new Employee("Carlos", "Gomez", 36852001, 12, 650);
        Employee e4 = new Employee("Federico", "Cabrera", 18123331, 6, 400);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        for (Employee e: employees) {
            salary.put(e.getId(), e.getHoursWorked()*e.getHourValue());
        }
    }
}