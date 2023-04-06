package day17_practices;

public class toStringMethod {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Max";
        dog1.breed = "German Shepherd";
        dog1.age = 3;
        dog1.gender = 'M';

        System.out.println(dog1);

        Dog dog2 = new Dog();
        dog2.name = "Lucy";
        dog2.breed = "Husky";
        dog2.age = 2;
        dog2.gender = 'F';

        System.out.println(dog2);




    }
}
/*
The toString method is executed automatically, whenever the object is passed in the print
statement. Whenever you try to print an object that you created toString method gets
executed automatically.
E.g. the Dog class that we previously have created. In this dog class we have added instance
variables, instance methods. Right now you cannot see the toString method, but it is already
inherited to this Dog class (inheritance: future topic).
As long as you created a class the toString method wil be there.
If you don´t specify what the toString method should return -> default value will be
returned everytime when you try to print the object of this class.

So far the toString method has not been specified yet in this dog class.
As soon as you passed a dog object in the print statement, compiler looks for the toString
method. Even though you cannot see the toString method in this dog class, it is still there,
inherited from the object class. So the default implementation of that toString method is
being executed. That`s why you have this hash-code (day17_practices.Dog@1d251891) right now.
If you don`t wish to see this hash code whenever you print an object, then you need to
specify the toString method.
The toString method is an instance method that returns you a String. Therefor when you
specify the toString method you have to give the signature of the method. The return type is
String. That`s why whenever you have a print statement you will be able to pass the object.
Whenever you have an object you will be able to pass it into the print statement. Because
this toString method automatically converts it to te String value.
 */