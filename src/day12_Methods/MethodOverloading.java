package day12_Methods;

public class MethodOverloading {

    public static void main(String[] args) {

        System.out.println(sum(10,20));

        System.out.println(sum(10,20,30));

        System.out.println(sum(10,20,30,40));

        }

    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return sum(a, b) + c;
    }

    public static int sum(int a, int b, int c, int d){
        return sum(a, b, c) + d;

    }


    }

/* Create a function that can return the sum of 2 numbers!
Create a function that can return the sum of 3 numbers!
Create a function that can return the sum of 4 numbers!
There will be different parameters, that will be required for each of those methods; e.g. first method must have 2 parameters,
in order to return the sum of 2 integers.
The 2nd method should have 3 parameters.
The last method should have 4 parameters.
So the parameters are different in those methods.
The main functionality of those methods are: all of them used for returning the sum.
-> Since the parameters are different and functionalities are similar, then I can use the same method name for all the four
methods.
For the first method I can give public and static as the access modifiers. Next I need to give the return type:
I need to return the sum, the value at the end -> integer. Because I need to return the sum of 2 integers.
Then the method name: sum.
Now I need to pass the parameters to this method. I want to be able to use this method to be able to find the sum of
2 integers -> I need to pass 2 parameters. After passing the first parameter you need to give comma, so that you can pass the second parameter.
Those parameters are the local variables of this method now. You can use those parameters to calculate the sum and then
return them from this method. At the end you can use the return statement to return the sum of those 2 numbers.
Now this method everytime when you call it, it is going to return you the sum of given 2 integers.

The 2nd method should be able to return me the sum of 3 integers -> I need to pass 3 parameters.
I can create this method as public static as the access modifiers.
If I add 3 integers at the end I get integer value -> The return type can be integer; if I wish to return the final value at the end.
Method name: sum
If you use the same method name -> The parameter has to be different. Here we have 3 parameters.
 */