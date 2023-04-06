package day10_StringPractice;

public class StringMethods1 {

    public static void main(String[] args) {

    String str = "Wooden Spoon";
    /* indexes:   01234567891011      Index numbers are unique for each character.
    By usíng the charAt() method you will be able to get this specific character at this specific index.
    If I call the charAt() method for the String, it is going to ask me to provide the index number.
    If I provide the index number for example 5, it is going to get me the character at index 5 which is n.
    It will return me as a char because every single character in a String is a char.
    If it returns me as a character, then I will be able to assign it to the char variable.
    Make sure to provide a valid index number.
    If you try to give an invalid index number in the charAt() method, you will get the exception message "String index out of bounds exception".
     */

    char ch1 = str.charAt(5);
        System.out.println(ch1);


    /* Everytime when you call the length method you don`t have to provide any argument at all within the parantheses.
    It is going to returning you the total number of the characters.
    If I want to find out how many characters are included in the String, including every single characters, space etc.,
    then I can just call the length() method. It will return me the integer number at the end.
    By using the length() method you can calculate the last index number.
    The last index number is equal to length minus 1.
    If you have 12 characters the last index number will be 11.
     */

    int l = str.length();
        System.out.println(l);



    }


}
