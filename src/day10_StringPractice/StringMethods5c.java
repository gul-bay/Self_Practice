package day10_StringPractice;

public class StringMethods5c {
    public static void main(String[] args) {

        String sentence = "I love Java programming language";
/* index numbers:          0123456789...

If I need to create a substring, that can starts from 'J' till 'a', including 'a' as well ('Java').
I can call the substring() method.
The index number of 'J' is 7. In the substring() method I can provide 7 as the beginning index.
The index number of 'a' is 10. If I just provide 10 -> this substring() method creates substring starting from index 7
till index 10, but the ending index will be excluded.
So the character at index 10 will not be included. This substring will only have 'Jav', till character 9.
This substring returns you String at the end, so you can also assign it to a String variable.
If you need to include the 'a' as well, then you need to add 1 on top of the index number 10 ->
you need to give index 11, which is the index number of the space after the 'a'.
But in this substring() method, if you give index 11, it will include the characters till index 10.
 */

    String word1 = sentence.substring(7,10+1);
        System.out.println(word1);

/* Another way of using the substring method:
When we call the substring() method, we can just provide the beginning index, by default it creates the substring
starting from the specified index till the end of the String;
it will also return you String, therefore you can also assign it to a String variable.
 */

    String word2 = sentence.substring(7); //"Java programming language"; starting from 'J' till the end of the String.
        System.out.println(word2);







    }
}
