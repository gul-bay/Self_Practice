package day19_ArrayPractice;

import java.util.Arrays;

public class ArrayCopyOfRangeMethod {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        //indices:        0   1   2   3   4   5   6   7   8

        int[] result = Arrays.copyOfRange(numbers,2,6);

        System.out.println(Arrays.toString(result)); //[30, 40, 50, 60]


    }
}
/*
Suppose this is the array, that I have now.
If I would like to copy the elements: 30, 40, 50, 60
into a new array, then I can use the copyOfRange() method. When you call the copyOfRange() method from the Arrays
utility class, it is going to ask you 3 arguments. 1st argument is array. From which array would you like to copy?
I would like to copy the range from the array numbers.
For the 2nd argument I need to provide the beginning and the ending indexes. From which index I would like to copy the
elements? i need to specify it.
I would like to copy the elements starting from index 2 till index 5. When give 5 as the ending index, the ending index
will be excluded, just like the substring ending index is excluded. Whichever element is at the index 5, it will be
excluded. This copyOfRange() method copies the elements starting from index 2 till, if you give 5 for the ending index,
it will copy till index 4. It will return you a new array at the end. So you can also assign it to a new array variable.
This is my 2nd array.
To print this array you still need to call the toString method from arrays utility class, then pass your 2nd array.
The 5th element 60 is excluded. [30, 40, 50]
I wanted to copy the range from 30 to 60, from index 2 to index 5.
In order to include the index 5, for the ending index you need to give 6.
Whatever the elements that you would like to include, on top of that index you need to add 1.
If I also need to copy the element at index 5, then I need to pass index 6. -> It is going to copy the elements starting
from index 2 to index 6, index 6 will be excluded.
*/