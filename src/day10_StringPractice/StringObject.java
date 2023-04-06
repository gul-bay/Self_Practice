package day10_StringPractice;

public class StringObject {

    public static void main(String[] args) {

        String str1 = "Java"; //String literal
        String str2 = "Java"; //String literal

        System.out.println(str1 == str2); //true

        String str3 = new String("Java");
        /* In order to give the String of text to the String object I still have to include String literal ("Java").
        The String literal "Java" is going to be created in the String pool, but in the String pool we already had the same text.
        The new keyword is going to open a new memory. It creates different memory in the heap outside the pool.
        The object that is created in the heap outside the pool will be referenced by this str3.
        It is not the same object, that is created in the String pool.
        Therefore, if you are compare this str3 with the String literal str1. They are not the same object.
        It is going to give you false.
         */
        String str4 = new String("Java");

        System.out.println(str3 == str1); //false
        /* Everytime when you use the new keyword, remember: A different object will be created,
        even though the data object has the same String of text. It is not the same object. */

        System.out.println(str3 == str4); //false
        /* Those 2 are the String objects that are created by using the new keyword. Even though they have the same String of text,
        but they will be different objects in the heap outside the pool.
         */








    }
}
