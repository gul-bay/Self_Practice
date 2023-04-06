package day04_concatenation;

public class SalaryCalculator {

    public static void main(String[] args) {

        String name = "Joshua";
        int hourlyRate = 40,
            weeklyHours = 45;
        int salary = 40 * 45 * 52;

        System.out.println(salary);
        System.out.println();
        System.out.println("Hello " +name+ ", " +"your salary is $ " + salary);


    }


}
/*
Create a class named SalaryCalculator.java
 Declare the following Variables:
     name
     hourlyRate
     weeklyHours
Write a program that can calculate the salary, and display the
following info:
    Hint: there are 52 weeks in a year
            salary = hourlyRate * weeklyHours * 52
Ex:
    given data:
        name = “Joshua”
        hourlyRate = 40
        weeklyHours = 45
output:
    Hello Joshua, your salary is $ 93600
 */
