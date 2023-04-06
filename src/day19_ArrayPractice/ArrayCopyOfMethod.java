package day19_ArrayPractice;

import java.util.Arrays;

public class ArrayCopyOfMethod {
    public static void main(String[] args) {

        int[] numbers = {100, 200, 300, 400};

        int[] result = Arrays.copyOf(numbers, 3);

        System.out.println(Arrays.toString(result)); //[100, 200, 300]


    }
}
/*
If this is the array that I have, and I would like to create a new array; in my new array I would like to copy 1st few
elements of this array. In this case I can use the copyOf() method.
If I want to create  new array, that contains the 1st 3 elements of this array, then from Arrays utility I can call
the copyOf() method. When I call the copyOf() method, the 1st argument that I provide has to be the array, that I
would like to copy. I would ilke to copy the elements of this array named numbers; I would like to copy the 1st 3
elements. In this case I need to specify the new length. The 2nd argument, that you provide, it has to be the new
length of the array, that will be returned from this copyOf() method.
E.g. If I set 3, it is going to create me a new array with the length of 3. In this array I will have the 1st 3
elements of this array numbers. Because I copied from this array numbers.
Since it returns me a new array I am able to assign it to an array variable, such as result. -> This is my 2nd array
variable.
Printing result New array with the 1st 3 elements of the original array.
If the new length is greater than the length of te original array, e.g. 7. Then the 1st 4 elements will be copied into
the new array and for the remaining 3 elements you will get the default value of the integer, which is zero. 3 zeros
will be added for the remaining 3 elements of this array.
This is the copyOf() method. You will pass the array as the 1st argument, the array that you would like to copy.
Then you will pass the length of the new array, that will be created. If the length, that you pass, is greater than the
length of the original array, zeros will be padded to the new array; only if it is necessary. Otherwise, the elements
will be copied into the new array.
 */