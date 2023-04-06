package day17_practices;

public class DogObjects {
    public static void main(String[] args) {

   Dog dog1 = new Dog();
   dog1.name = "Max";

   Dog dog2 = new Dog();
   dog2.name = "Lucy";

        System.out.println(dog1.name); //Max
        System.out.println(dog2.name); //Lucy

        dog1.eat(); //print result: Max is eating dog food
        dog2.eat(); //Lucy is eating dog food

    }
}
/*
How can I create the Dog objet?
To create an object from the custom class Dog: First I give the new keyword,
then the constructor Dog.
If the Dog class is in a different package you would have to import it first.
Here it is not necessary, since they are in the same package.
Once you create the Dog object, you can also assign it to a variable,
just in case if you want to reuse this object -> I can assign it to the variable dog1.
Now I created one instance from the Dog class.
You can create multiple instances, as many objects as you want from a class.
E.g. I can assign another dog object and assign it to the variable dog2.
If I created 2 dog objects -> all those instances will have 2 separate copies, that will be
shared by those 2 objects. In each of the object you will be able to store different name,
breed, age, gender.
E.g. I can set the name of the dog1 to Max.
In order to set the name of the dog, after you create the dog objects, all you have to do is
you access/call the instance variables through the object.
Right now my object is assigned to the variable dog1, so the object name is dog1.
When you call the instance variable name through this object, it is going to set the name of
this object only. It will not effect the name of other objects.
E.g. if I set the name of the first dog object to "Max" -> only the 1st dogs name is Max.
If the name object is not set -> print result: null.

We have also the instance methods, that you can call through the objects of this class.
We have created those 2 methods in the Dog class as instance -> The 2 dog objects have 2
separate copies of those instance methods.
E.g. when I call the 'eat() method' from the 1st dog object, then only the 1st dog Max will be
eating. Then the 'eat()method' perform its task within this object only.
If I want also the 2nd dog also eating, then I need to call the 'eat()method' also from the
2nd dog object.Because each object have separate copies of the instances.
I can also set the breed, age, gender for each of the dog.
 */