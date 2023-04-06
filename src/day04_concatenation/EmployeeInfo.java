package day04_concatenation;

public class EmployeeInfo {

    public static void main(String[] args) {

        String name = "Daniel";
        int age = 28;
        String gender = "Male";
        String company_name = "Google Inc",
                job_title = "Software Developer";
        int salary = 90_000;

        System.out.println("given data:");
        System.out.println("\tname = " +  name);
        System.out.println("\tage = " + age);
        System.out.println("\tgender = " + gender);
        System.out.println("\tcompany_name = " + company_name);
        System.out.println("\tjob_title = " + job_title);
        System.out.println("\tsalary = " + salary);
        System.out.println("");

        System.out.println(name +" is " +age +" years old, gender is " + gender + ".");
        System.out.println(name +" works at " + company_name + " as a " + job_title + ".");
        System.out.println(name + " makes $ " + salary + " per year.");





    }
}
/*
Create a class named EmployeeInfo.java
 Declare the following Variables:
     name
     age
     gender
     company_name
     jobTitle
     salary
 Use concatenation to display the full info of the employee:
Ex:
    given data:
            name = “Daniel”
            age = 28
            gender = “Male”
            company_name = “Google Inc”
            job_title = ”Software Developer"
            salary = 90000
output:
        Daniel is 28 years old, gender is Male.
        Daniel works at Google Inc as a Software Developer.
        Daniel makes $ 90000 per year.

 */
