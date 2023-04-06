package day04_concatenation;

public class CarInfo {
    public static void main(String[] args) {

        int year = 2018;
        String make = "Toyota",
                model = "Camry";
        int miles = 50000;
        String color = "Red",
                Price = "$19000";

        System.out.println("Car information is:\n\t" + year +" " + make +" " + model + ", " + miles +" miles" + ", "
                + color +", " + Price + ".");






    }
}
/*
Create a class named CarInfo.java
 Declare the following variables:
     year
     make
     model
     miles
     color
     Price
 Use concatenation to print the full info of the car in the
following format:
    Year Make Model, Miles, Color, Price.
Ex:
    Car information is :
        2018 Toyota Camry, 50000 miles, Red, $19000.

 */
