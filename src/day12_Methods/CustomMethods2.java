package day12_Methods;

public class CustomMethods2 {
    public static void main(String[] args) {

        displayCube(10);

        displayCube(5);

    }


public static void displayCube(int num){

    int cube = num * num * num;
    System.out.println("Cube of " +num + " is " +cube);
    /* Cube of 10 is 1000
       Cube of 5 is 125
     */


}


}
/* Create a function that can display the cube of a number!

The created method passing a parameter: int num
because this information is a must for this method to have in order to complete its task.
Otherwise, this method can not perform its task. The only way for this method to perform its task is, having this number num,
then it can display the cube of that number.
Once this method is being created, in order to call this method inside this main method, I need to give the method name.
After the method name I need to give the parenthesis. If I don`t give anything in the parenthesis, it is giving me compile error.
Everytime when you call the method with parameters, if you do not provide the argument, then you will have compile error.
If the method is passing parameter means, argument is a must for this method, in order to perform its task.
We have to provide the argument, it is a must for this method.
The argument that we provide, it can not be any type of value, it has to match with the data type of your parameters variable.
If the data type of your parameters variable is int, the argument that you provide here has to be integer as well.
For example 10. This is the argument I passed into this method because this method is passing a parameter.
When this method is being executed this argument will be assigned to the parameter variable num.
Inside this method, whichever code fragment is using this num, it will have the value of 10; 10 will be passed to those code fragments,
when the method displayCube s call is being executed.
At the end I will be able to display the cube of the number 10.
Once you have this method, you can call this method as many times as you want. You can pass any integer, then this method
will display the cube of any integer number.
For example if I call it a 2nd time, pass the number 5. When the Java compiler executes line 8, it is going to run this method again.
When it runs this method again, it is going to have 5 as the value of this parameter variable num.
Then it is going to display the cube of the number 5.
So these code fragments will be executed twice, if you call the method 2 times.
First time it will be executed for the integer number 10,
second time it will be executed fo the integer number 5.
 */
