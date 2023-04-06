package day12_Methods;

public class CustomMethods3 {
    public static void main(String[] args) {

    int total = sum(10,20);

        System.out.println(total);

        System.out.println( sum(100,200) );

    }

public static int sum(int num1, int num2){
        int sum = num1 + num2;


        return sum;

}

}
/* Create a function that can return the sum of 2 integers!
You need to return the sum of 2 integers, so that you can use the sum, that new data, that you get by adding those 2 integers.
The benefit of using return method is the value, you can return it from the method, even outside the method you can use it.
If you need to reuse the data, which is the sum of 2 integers, then the return method is the best choice. It allows you to reuse
that data, that you got after performing the task of that method.
After the method performing its task, if there is any new information, that you wish to reuse it, you wish to use it outside the method,
then you should create return method.
If I find the sum of 2 integers, at the end I will have integer number. That means there will be an integer number that I wish
to return from the method.
When I create my method for access modifier I will give 'public' and the 'static' specifier.
If you give as the return type 'void', that means you won`t be able to return the value, which is the sum of 2 integers;
which means you won`t be able to reuse that data, that you can get after the method perform its task.
Instead, if I want to be able to return that value and use it later on, then I should give different return type, e.g. integer.
Because if I add 2 integer numbers I will have integer result at the end. As soon as I give this integer as a return type,
it indicates that from this method that I am creating, at the end I will get integer value to be returned.
Next you can give the method name, e.g. sum. This method must return the sum of 2 numbers, therefore there are 2 integers,
that the method must have. Without those 2 informations the method can not find the sum of 2 numbers.
So I can pass 2 parameters in this method because 2 informations are must have for this method. Then you can get the sum of those 2
numbers now, within this methods body: The sum will be first number + the second number.
Imagine if this method is not a return method, instead if it is a void method -> There is no way that this data you can use
it later on after this method. So if I wish to reuse this data, to be able to use it even outside the method, to be able
to use ut later on, then I have to make sure, that this data can be returned from the method. Therefore, the return type
has to be matching with the data type of this variable which is int.
Everytime when the return type of the method is not 'void' it becomes a must to return a value.
At the very end you need to give the return statement and the value, that you wish to return from this method.
The value, that I wish to return from this method is sum.
As long as the return value is matching with the return type, then this method it can return the integer, the specific
value that you are looking for.
Make sure that after the return statement this method gets exit. After line 12 this current method gets exit; if you give
any code fragments you will get the unreachable statement/error.
So this is how you can create the return method to make the data to be reusable. The data that you got after the method performing
its task. After performing its task I can choose the return, the value if the return type of the method is matching
with this value that I am about to return.
 */

/* When I call this method sum(10,20);
Since it is a return method you can treat this method call as a value.
If this was a void method, then you could not do that. But return methods they will give you a value at the end.
If this method gives me value at the end, I can also assign the value to a variable: int total.
Then I can continue to use this variable over and over again, which will give me the sum of 10 and 20.
You can print this variable -> 30.
Since the return method, who gives you value at the end, you can also pass the method call of this return method into the
print statement; any value can be pass in the print statement.
The sum method is returning me a value.
Therefore, in this print statement I can call the sum method, which returns me a value. Then I can pass 2 numbers.
If it is a return method, you can treat it as a value at the end, after we call the method.
 */