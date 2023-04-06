package day10_StringPractice;

public class StringMethods7 {
    public static void main(String[] args) {

        String str = "   ";
/* This String does not have any characters other than just space, which is considered as blank.
But this String right now is not empty.
If the String is not empty, when you call the isEmpty() method, it will return you false because the length of the String is not zero.
 */
        System.out.println(str.isEmpty()); //false
        System.out.println(str.isBlank()); //true

        String result = "";
        System.out.println(result.isEmpty()); //true
/* This String is empty because the length of the String is zero -> the isEmpty() method returns me true.
As long as the length of the String is zero, isEmpty() method will return you true.
But if it is not zero, it always returns you false.
 */






    }
}
