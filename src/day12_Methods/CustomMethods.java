package day12_Methods;

public class CustomMethods {
    public static void main(String[] args) {

        System.out.println("Test Started");

        displayMessage();

        System.out.println("Test Completed");

    }

    public static void displayMessage(){
        System.out.println("Hello everyone!");
        System.out.println("I love Java");

    }

}
/* if you already have created a method, in order to execute this method, you need to call it.
Whichever code fragments that you give within the main methods body, those code fragments will be executed, when you run this class.
When I run this class, if I want line 15+16, that I stored in this custom methods body, to be executed, then I have to call this method.
So inside this main method, I can call this custom method, that I created.
When I call this custom method, that I created, I call it by the method name: displayMessage();
So this displayMessage(); I call it in line 8, in this main method. -> When this line 8 gets executed, it is going to jump to the
body of this method, and executes line 15, then line 16.
After this method is being executed, then it is going to execute the next lines after line 8 of this main method.
If you give any code fragments before and after calling this method,
Java executes the codes from top to bottom.
So when this main method gets executed, first it is going to execute the print statement in line 6, "Test Started".
After printing "Test Started", then it is going to call displayMessage(); in line 8.
So this displayMessage() method, it is going to execute the method in line 14, the code fragments in line 15 and 16,
that you stored, you grouped within this methods body.
After this method is fully being executed, then it is going to continue starting from the next line 10 of this main method,
which is "Test Completed".

Test Started
Hello everyone!
I love Java
Test Completed
 */