package day10_StringPractice;

public class StringMethods7b {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = new String("Java");
        String str3 = new String("Java");

        String str4 = new String("JAVA");

        System.out.println(str1 == str2); //false

        System.out.println(str1.equals(str2)); //true
        System.out.println(str2.equals(str3)); //true
        System.out.println(str3.equalsIgnoreCase(str4)); //true
/* We cannot use the equal operator to compare String because it is going to check if those 2 objects are same objects.
If they are different objects, even though they have the same String of text, then it will still return you false.

Starting from now on if you need to compare the values of the objects, you should be using equals methods; regardless what object it is
(String or any other object).
If I need to compare if the values of those 2 Strings are equal, I can call the equals() method and then paste the 2nd String as the argument.
This equals() method just is going to compare the values of those 2 Strings.
If they have the same String of text, it will return me true.
Even though they are different objects, but they have the same String of text.

If you want to ignore the case sensitivity because Java is a very case sensitive language.
Here we have another String, which contains all upper case version of JAVA.
I want to compare if this String has the same text with other Strings.
 */








    }
}
