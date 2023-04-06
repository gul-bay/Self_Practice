package day19_ArrayPractice;

import java.util.Arrays;

public class ArraySortMethod {
    public static void main(String[] args) {

        int[] numbers = {100, 50, 20, 10, 80, 90, 60, 30, 20, 40};

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers)); //[10, 20, 20, 30, 40, 50, 60, 80, 90, 100]


        String[] words = {"Ruby", "Java", "Python", "C#"};

        Arrays.sort(words);

        System.out.println(Arrays.toString(words));
        /*[C#, Java, Python, Ruby]; C sharp is the 1st element in this array.
        If you compare the first character of each of the word, the upper case character C on the ASCII table has lower
        number than any of those words first character.
         */

    }
}
/*
If I have an integer array, that is not sorted and I want to keep it in a sorted order, then from the Arrays utility
class I can call the sort() method. Once I call the sort method I can pass a single dimensional array.
If the array, that I pass is an integer array, it is going to sort the integer array from the smallest to the largest
number. The elements from the array will be sorted from the smallest to the largest.
When I print this array -> in the result this array is sorted now.

If you have a String array or char array, that you need to sort, it is going to be sorted in the alphabetical order.

When we compare 2 arrays, that have the same elements but in the different order -> equals() method returns us false.
Even though the 2 arrays have the same elements, but they are in different order.
In this case when you compare the arrays if you would like to ignore the order, then you can sort those arrays:

Array.sort(arr1);
Array.sort(arr2);

Once you sort the 2 arrays, they both will be in the ascending order, and if they have the same elements, it is going to
return you true.
 */