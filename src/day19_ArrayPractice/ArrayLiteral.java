package day19_ArrayPractice;

import java.util.Arrays;

public class ArrayLiteral {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println(numbers.length);

        System.out.println(Arrays.toString(numbers)); //[10, 20, 30, 40, 50]


    }
}
/*
If you know how many elements will be stored in the array you could instantiate the array by using the new keyword.
E.g. if there will be 5 numbers will be stored into an array variable and if I don`t know what those 5 numbers are,
then this is how I supposed to instantiate the array variable: I need to use the new keyword, then I need to give the
size of the array within the square brackets [5]. It is only for if you don`t know what those 5 elements are.
But you do know how many elements will be there, which is 5.
 int[] numbers = new int[5];

If you do know how many elements and what those elements are, that will be stored into the array, then there is no need
to instantiate the array by using this new keyword, you can just instantiate it by using arrays literal: I will give {}.
If I need to store 5 elements and set the size of these elements to 5, then I can give those 5 elements within this curly
braces. Each element is separated by a comma. So this is also an array object, that we created.
The size of this array object right now is 5 and this size is fixed.
So after line 6 the size of this array object is unchangeable. You can still access and update the elements, but you
won`t be able to change the size of this array.
If you want to know what is the size of the array, from the array variable you just need to call the length variable.
Length is going to return you how many elements that you have in this array. In this array now we have 5 elements.
Let us print this array to see what those elements are. In order to print the single dimensional array from te arrays
utility, you will call the toString method. Then within this toString method you will pass this array, that you have
as an argument. Then it is going to print all the elements of the array, the whole array.
This arrays literal you should only use, when you know how many elements and what those elements are.
 */