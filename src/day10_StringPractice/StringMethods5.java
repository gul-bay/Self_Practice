package day10_StringPractice;

public class StringMethods5 {
    public static void main(String[] args) {

    String sentence = "Python is cool, I Love Python Programming";
    /* If I need to replace all the word Python with Java, then I can call the replace() method.
When you call the replace() method, you can replace one specific character, or you can replace a sequence of characters.
The replace() method will replace all the "Python" with "Java" in the new String because String is immutable.
This String object once it created is unchangeable.
The replace() method creates a new String object. The new String object will contain "Java" instead of "Python";
"Python" will be replaced with "Java".
     */
    sentence = sentence.replace("Python", "Java");
    /* "Java is cool, I Love Java Programming" -> new String object.
    If you wish this new String object to be referenced by the variable sentence, you need to assign it back.
    Otherwise, if you don`t assign it back, it will still print the original String of text, which includes "Python".
    If I want this new String object to be stored into this container/ this variable sentence, then I should assign this new
    String object back to the variable sentence.
    Now we have in this variable sentence "Java" instead of "Python".
    The replace() method will replace all the matching ones in the new String, that it returned.
     */
        System.out.println(sentence);











    }
}
