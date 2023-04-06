package day17_practices;

public class DogObject2 {

    public String name;
    public String breed;
    public int age;
    public char gender;

    public void eat(){
        System.out.println(name + " is eating dog food");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    @Override
    public String toString() {
        return "DogObject2{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}




/*
The toString method is an instance method that returns you a String. Therefor when you
specify the toString method you have to give the signature of the method. The return type is
String.  public String toString(){
        return "Name: " + name;
That`s why whenever you have a print statement you will be able to pass the object.
Whenever you have an object you will be able to pass it into the print statement. Because
this toString method automatically converts it to te String value.
The name of the method is: toString. Whatever the String value this method will return, it
is what will be displayed on the console as well.
So this toString method is not a new method. It is a method that was already inherited to
this dog class. That´s why you have this override sign (future topic).
Whatever String value that you return from this method, it determines how the object should
be printed whenever you pass the object in the print statement.
E.g. if I want to print the name of the dog only: I pass name, then I concat the actual name
of the dog.
The instance variable name contains the name of the dog because we declare the name variable.
It is used for storing the name of the dog.
Everytime when this toString method gets executed it is going to return the String
concatenation above. -> If I run the program (in class toStringMethod) one more time,
now with the toString method, then it is going to print me the name of the dog1.
Because name is the only one that you specified in the toString method.
If you wish to display all the attributes or some of the attributes of the dog,
whenever the dog object is printed. -> You can use the shortcut of this toString method.
Then whenever you print the dog object it is going to display the full information or some
of the information of the dog.

Shortcut: do the right click, Generate option, toString.
Then it will ask you which instance variables would you like to include; which data members
would you like to include in the toString method.
If I wish all information to be displayed -> select them all; click ok.
-> toString method will be generated automatically.
If I run this class (toStringMethod) again, it is going to display the full information of this dog1.
Once you have this toString method that is specified in this dog class, regardless of how many dog objects are created
from this dog class, you will be able to print every single one of this dog object.
E.g. if I create the 2nd dog object, it also sets its instance variables.
You are also able to display the full information of this dog object just by passing the object name in the print
statement. As soon as you passed this object name in the print statement, this object now have also the toString method.
As you can see this toString method is also an instance method, which means separate copies of these toString method
will be created for the new object as well.
When this object is passed into the print statement its toString method gets executed. The toString method is going to
display the name, breed, age, gender of this dog.
Now if you run it, this time it is going to display the information of the 2nd dog object.
If you don`t have the toString method that is specified in your custom class, then next time when you print the object
of that custom class, you will be getting hash code.
*/