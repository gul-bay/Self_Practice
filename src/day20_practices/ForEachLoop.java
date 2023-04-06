package day20_practices;

public class ForEachLoop {
    public static void main(String[] args) {

        String[] array = {"Ruby", "Java", "Python", "C#"};

        for(String each : array){
            System.out.println(each);
        }






    }
}
/*
How can we apply the for each loop to the data structure, such as array?
Suppose that this is the array, that is given to you, and you need to access each successive value of this array,
starting from beginning to the end.
If you need to access each successive value of array starting from the beginning to the end, then you have 2 options: You can use
the regular for loop, or you can also use the for each loop. Because for each loop can also be used for accessing the
elements from first to the last of a data structure. When you use the for each loop you have the access to the elements
of the data structure from beginning to the end.
If you have to apply the for each loop, first of all there has to be a data structure. That´s the precondition.
Our data structure above is array. Therefor I can apply the for each loop. Inside the parenthesis of for each loop you do
have this colon, that will be separating data structure and the variable of the for each loop. So on the right side of
the colon you have to provide your data structure, that you want to iterate. Our data structure here is array.
On the left side of the colon you have to give a variable, which will be representing each successive value of this data
structure. Each value in this data structure is a String. -> The data type, that you give for the variable in this for
each loop, has to be String. Then you give a variable, which you can call to get access to each value of the array.
Usually the preferred variable for the for each loop is each; stands for each element of the data structure.
The iteration order of this for each loop will be starting from the first element to the last element. This order is
unchangeable.
If you have to iterate this array in the reversed order or in different order, then you can not use this for each.
Because for each only iterates over an array in the index order from first to the last. In this for each loop you do not
have access to the index numbers at all.
That means: If you need to do some updating to the array, then in the for each loop you cannot do that, because you don`t
have the index number in the for each loop.
Unless you declare additional variable before you declare the for each loop, that can represent the index numbers.
Otherwise, you can not use this for each loop for updating the elements of the array. Because it does not have the
index numbers.
When you call this each, it is going to get you every single elements during each iteration: In the 1st iteration it gets
you the 1st element, in the last iteration it gets you the last element of the array.
This order is fixed; you can not change it at all.
Benefit of the for each loop: initialization, condition, iterator are all fixed and are already given in the background.
This for each loop never becomes an infinite loop, like the for loop or while loop can. As long as the size of the data
structure is confirmed. If the data structure has 10 elements, then this for each loop only runs 10 times.

Shortcut for applying the for each loop to the data structures in Java. As long as you have the data structure, that
is declared. In order to access each element of this data structure, from the data structure you will call for.
By default, the for loop, that is given as 1st option, is the for each loop. As soon as you type for and hit the enter,
it is going to give you the for each loop.
By using this for each loop you can access each successive value of this data structure.
This is how you can looping through an array with the for each loop.
 */