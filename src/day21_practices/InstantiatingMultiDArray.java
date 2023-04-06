package day21_practices;

import java.util.Arrays;

public class InstantiatingMultiDArray {

    public static void main(String[] args) {

       // int[][] arr2D = new int[3][];

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7},{8, 9, 10, 11, 12}};

        System.out.println(arr2D.length); //3
        System.out.println(Arrays.deepToString(arr2D)); // [[1, 2, 3], [4, 5, 6, 7], [8, 9, 10, 11, 12]]

    }
}
/*
Multi D array is used as a container for other arrays. It is an array of arrays.
E.g if you have multiple single d.a`s, that you need to store into a variable, then you will need multi d.a.
Suppose that there are 3 single d. a`s, that you would like to store into a variable. Those 3 single d.a`s are also
unknown. You don`t know what the exact elements in those 3 single d.a`s are. In this case in order to create a variable
that can contain this 3 single d.a`s, we need to instantiate the multi d.a. by using the new keyword. Because those
single d.a`s are unknown, and we also don`t know what elements are in those single d.a`s.
To create the variable that can be used as a container for those 3 single d.a`s, that we will be storing in the future,
this is how I can declare the 2 d.a.:
If those single d.a`s are integer arrays, then my 2 d.a`s data type should be integer as well. In order to declare the
2 d.a. you have to give 2 square brackets, which defines it as 2 d.a.
Then you can give your array variable: arr2D.
In order to instantiate it, if the arrays that we are going to store in this 2 d.a. are unknown, then you can
instantiate it by using the new keyword. After the new keyword you give the data type. You will also give 2 square
brackets.
When you instantiate this array by using this new keyword, since the array size is fixed, it is going to ask you,
how many arrays you will store in this 2 d.a. Since the 2 d.a. is used for containing multiple single d.a`s, you need to
specify, how many single d.a`s does this array will be used to contain for.
I want this array to be a container for 3 single d.a`s. Therefor here I need to specify the number of single d.a`s.
Now it indicates that this 2 d.a. is a container for 3 one d.a`s.
What if you do know what those single d.a`s are? In this case you can just instantiate the 2 d.a. variable by using
array literal: Within the curly braces I need to specify, I need to give each single d.a`s.
The length of this 2 d.a. depends on the total number of the single d.a., that it is containing.
E.g. if you print the length of this array now, it is going to give you the total number of the single d.a`s, that are
included in this 2 d.a., which is 3.
You can also print the 2 d.a. as a whole to see what are the single d.a`s and what are the elements in them.
In order to print the 2 d.a. or any other multi d.a`s, you can no longer use toString method. Because toString method is
designed for printing the single d.a`s only.
To print the multi d.a`s, from the Arrays utility class we will call the deepToString method. Then you will pass the
2 d.a., that you have. Now it is going to print the entire 2 d.a. on the console.
This is how you can instantiate the multi d.a.
*/