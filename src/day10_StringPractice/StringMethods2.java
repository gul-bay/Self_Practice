package day10_StringPractice;

public class StringMethods2 {

    public static void main(String[] args) {

        String str1 = "WOODEN SPOON";
    /* Once this String object is created it is immutable.
    When you call the function such as toLowerCase(), this function will end up creating new String object,
    since it can not modify this String object because it is immutable.
    So the new String object that it created will be "wooden spoon".
    If you no longer wish to use the original String object, but if you want to use the new String object, you need to assign this method back
    to the variable str1. Otherwise, str1 is still pointing at the old, original object.
    This variable is still referencing to "WOODEN SPOON".
    If you want the new String object to be referenced by this variable, you need to assign re-initialize this variable str1.
    Now this str1 is the referenced variable for the new object "wooden spoon".
     */

        str1 = str1.toLowerCase(); //"wooden spoon"
        System.out.println(str1);

        String name ="cydeo school";
        name = name.toUpperCase(); //"CYDEO SCHOOL"
    /* toUpperCase() method is used for converting the String object to the upper case version.
    It can not modify the existing String object; it will create a new String.
    If I want to convert "cydeo school" to upper case, modifying this object, that is already created, is impossible because it is immutable.
    But I can create a new String object, which contains the upper case version of this String.
    It is returning me a new String object, which has the upper case version "CYDEO SCHOOL".
    If you want this new String object to referenced by this variable, then you must assign it back.
    Otherwise, it will still be referencing to the old String object. Because the old String object is unchangeable.
    toUpperCase() method, that you call from the String, will create a new String. They are unable to change the original String object.
    When you print the name now it is giving you "CYDEO SCHOOL".
     */
        System.out.println(name);



    }

}
