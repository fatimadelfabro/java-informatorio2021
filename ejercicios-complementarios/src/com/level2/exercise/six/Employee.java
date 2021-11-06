package com.level2.exercise.six;

public class Employee {
    private String name;
    private String surname;
    private int id;
    private int hoursWorked;
    private double hourValue;

    public Employee(String name, String surname, int id, int hoursWorked, int hourValue){
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.hoursWorked = hoursWorked;
        this.hourValue = hourValue;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }

    public void setSurname(String surname) { this.surname = surname; }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public int getHoursWorked() { return hoursWorked; }

    public void setHoursWorked(int hoursWorked) { this.hoursWorked = hoursWorked; }

    public double getHourValue() { return hourValue; }

    public void setHourValue(double hourValue) { this.hourValue = hourValue; }

    public String toString(){
        return "Employee: " + getName() + getSurname() + "\n" +
                "ID: " + getId()  + "\n" +
                "Hours Worked: " + getHoursWorked()  + "\n" +
                "Hour Value" + getHourValue();
    }
}
