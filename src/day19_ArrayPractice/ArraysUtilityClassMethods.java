package day19_ArrayPractice;

import java.util.Arrays;

public class ArraysUtilityClassMethods {
    public static void main(String[] args) {

        int[] scores = {10, 20, 30, 40, 50};

        System.out.println(scores);

        System.out.println(Arrays.toString(scores));



    }
}
/*
If you have any data type of array, that you would like to print, since array is an object in Java to print the object,
toString method has to be executed. But this array itself does not have the toString method.
Therefor when I pass this array object, array reference variable in the print statement, when it tries to print array,
I will end up getting hash code.
toString method needs to be executed in order to print an object.
toString method, that is designed in order to print the array objects, are stored in the arrays utility class.
In order to print this array object now I have to call the toString method. Otherwise, I am getting the hash code.
In order to use the methods of the arrays utility class, 1st of all you need to import the arrays utility class.
So in order to import the arrays utility class, under the package above the class header you will give the import
statement, that can import arrays utility class. We need to import it from the util package of Java, and the class name
is Arrays; just like the way we imported the scanner. Or when you type the class name in the print statement, it will
give you the option to import the class: I need to call the toString method in order to print the array. So from the
arrays utility class I can call this toString. Once I call this toString method, it is going to ask for an argument.
Without giving the argument this method will not run. The argument that we provide here, it has to be a single
dimensional array. I will pass this array within the parenthesis of these toString method.
When I run it, it is going to print me all the elements of the array.
This is the functionality of the toString method.
 */