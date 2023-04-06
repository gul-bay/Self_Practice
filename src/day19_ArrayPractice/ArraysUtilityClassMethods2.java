package day19_ArrayPractice;

import java.util.Arrays;

public interface ArraysUtilityClassMethods2 {
    public static void main(String[] args) {

        char[] arr1 = {'A', 'B', 'C'};
        char[] arr2 = {'A', 'B', 'C'};

       boolean result = Arrays.equals(arr1,arr2);

        System.out.println("result = " + result); // result = true



    }
}
/*
Here are 2 char array objects, 2 array literals. Even though they are different array objects, arr1 and arr2 are equal.
They do have the same exact elements.
If you would like to compare the values of those 2 array objects, to see if they are equal or not, then you can use the
equals() method. In order to use the equals() method from Arrays utility class, you will call the method equals, then
you can pass 2 arguments in these equals() method. 1st argument should be 1st array: arr1.
2nd argument should be 2nd array: arr2.
If those 2 arrays are actually equal, have the same exact elements in the same exact order, then this equals method will
return you true; otherwise it will return you false.
Since this equals method returns you true or false, you can assign the result to the boolean variable.
-> Returns true because the 2 arrays they do have the same number of elements and are in the same exact order.
If they not in the same exact order -> returns false.

 */