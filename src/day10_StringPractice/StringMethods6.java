package day10_StringPractice;

public class StringMethods6 {
    public static void main(String[] args) {

        String str = "Java";

/* If I need to repeat this String 4 times, then I can call the repeat() method.
I need to provide the integer argument, which is the number of repeating times.
This repeat() method is going to return you a new String at the end.
You can also assign it back to a String variable ("JavaJavaJavaJava").
If you want to include some spaces during repeating, you can concat a space first before repeating.
This String will be concated by space; therefore it will be repeated 4 times.
 */

       String result = str.concat(" ").repeat(4); // Java Java Java Java

        System.out.println(result);






    }
}
