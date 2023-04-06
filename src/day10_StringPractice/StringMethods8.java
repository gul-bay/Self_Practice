package day10_StringPractice;

public class StringMethods8 {
    public static void main(String[] args) {

        String sentence = "I love Java and Python programming languages";

/* From this sentence I want to verify if the word Java is included; appeared in the sentence or not.
If sentence includes 'Java' in it, then it will return you true.
Otherwise, it will return you false.
 */

        boolean hasJava = sentence.contains("Java"); //true
        System.out.println(hasJava);

        boolean hasJava2 = sentence.toLowerCase().contains("java"); //true
        System.out.println(hasJava2);

/* From the String I can call the contains() method, then I can give the String "Java", that I want to check if it is included
in the sentence.
The contains() method returns you boolean -> you are able to assign it to a boolean variable hasJava.
It return true because we do have 'Java' in the sentence.

The contains method is case sensitive as well.
If you give lower case 'java', it will return false because we don`t have lower case 'java' in the sentence.
How can I ignore the case sensitivity?
Before call the contains() method, first you can call either toUpperCase or toLowerCase method to create the String object,
which contains the lower case version only.
Then you can call the contains() method to check if lower case 'java' is appeared in this lower case version of the sentence.
It returns true or false.
If the String that you give is not contained in the sentence, then you get false.
 */




    }
}
