package day10_StringPractice;

public class StringMethods3 {
    public static void main(String[] args) {

        String str = "  CYDEO    ";
        /* This String of text contains lots of spaces at the beginning and at the end.
        Those spaces are not used for splitting the words. Basically unused spaces, also known as whitespace.
        If you print this String, even on the console now, you will also get this whitespaces; even though they are not used,
        but they are still the characters of the String.
        If you wish to remove those whitespaces, then you will need this trim() method.
        If you just call the trim() method from this String object, that does not mean that within this object those whitespaces are being removed.
        Because the String object is still immutable.
        The variable str is referencing to "  CYDEO    ", which is immutable.
        When you call the trim method, it creates you the new object.
        In this new object those whitespaces will not be included. "CYDEO"
        If you no longer wish to use this original String object, after the new object is created,
        then this new object you need to assign it back to this referenced variable str.
        The value of the variable str now is updated.
        After line23 , when you call it, you will get "CYDEO".
         */

       str = str.trim(); //"CYDEO"
        System.out.println(str);

        // Whitespaces can be any space, that is not used for splitting the words, what is supposed to use for.







    }
}
