package day10_StringPractice;

public class StringMethods5b {
    public static void main(String[] args) {

        String sentence = "Python is cool, I Love Python Programming";

        sentence = sentence.replaceFirst("Python","Java");
        System.out.println(sentence);
/* "Java is cool, I Love Python Programming"
When you call the replaceFirst() method to replace 'Python' with 'Java', then only the first 'Python' will be replaced with 'Java'.
It will return you a new String; in this only the first 'Python' will be replaced with 'Java'.
The remaining 'Python's will not be replaced in the String.
If you want this new String object to be referenced by this reference variable sentence, then you need to assign it back
to the reference variable sentence.
 */










    }
}
