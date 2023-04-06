package day17_practices;

public class Dog {

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
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
How can I write a custom class?
Suppose that I want to create multiple dog objects because I want to be able to store the information of different dogs.
In order to create the dog objects first of all I need to have a dog class. Because every single objects came from a class.
When I create this dog class I will be able to specify the data members, which also known as the attributes, as well as the
actions of the dog objects in this class. Because class is a blueprint; it is just a set of instructions
of how the objects of specific types should be built. So everytime when I create a dog object, lets say I want to be able
to store the name of the dog in that object. So therefor I need to make sure that in this dog class I do have the variable
that can help me to store the name for the dog objects name. -> I can declare the variable as instance because I want to
make sure that the more dog objects that I create I still will be able to store different names for different dog objects.
If you don`t store different names for different dog objects then the variable should be static.
In my case right now the more dog objects that I create I want to be able to store, the more different names into the dog
objects.
So I can declare my variable name as an instance. I will give public first for the access modifier that indicates that
I can call this instance variable from any package. For data type I can use string. Since its instance now if I created
10 dog objects here I will be able to store 10 different names in total for those 10 different objects.
The data members that you specify in the class determines what kind of field /data can be stored into the object.
I can also add the instance variables breed, age, gender into this class, which indicates that everytime when the object
from this class is created we will be able to assign values to those instance variables of that object.
Each object will have separate copies of those instance variables.
When you write the class besides the data members you should also specify the actions, that the dog objects can do.
Everytime when I create the dog object, I also want to be able to call the methods, the actions I want the object to be
able to perform, such as eat. -> I can create the method eat; that way everytime when I call the eat method from the
object, then it is going to give me the output of which of the dog is eating.
I want this 'eat method' to be an instance as well. So that way each of the dog object will have their own actions of eat.
I need to declare this 'eat method' as instance; instance method means you don`t include the static specifier in the method
signature. You give the void if you don`t wish to return any value. Then you can give the method name, e.g. eat.
Everytime when this 'eat method' is being called from the object. Since it is an instance method the only way you can
call it outside the class will be through an object. Everytime when it is called from a dog object; lets say I want this
method to display the name of the dog that is eating.
You can also add more functions into this dog class depending on how would you like to create an object,
what kind of actions the object will have.
Let`s also add one more method, e.g. sleep. Whenever the sleep method is being called from which of the dog object, I
want to print that with the name of the dog object at the same time along with string of text.
After adding those instance variables, instance methods, when you create the object, that means in that dog object you
will be able to store the name of the dog, breed o.t.d., age o.t.d., gender o.t.d.
From that dog object you will be able to call eat function and sleep function. Since those are instances, from which of
the dog object that you call, it is going to display the name of that specific one object.
Then it will also include those additional string of text that you concat afterwards.
 */