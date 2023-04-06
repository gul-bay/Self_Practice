package day10_StringPractice;

public class StringMethods4 {
    public static void main(String[] args) {

        String str = "Java Programming Language";
        /* In the String we have multiple 'a's.
        If I need to find the index number of the first 'a', I have to call the indexOf() method.
        Paste the character that you want to find the index number of.
        As soon as you paste this 'a', then this indexOf() method is going to check every single characters of the String
        from left to right.
        Whichever character in the String is matching with this given argument; from the given argument the first characters
        index number will be returned.
        The indexOf() method will return you the index number of the first 'a'.
        Since it returns you as an integer, then you can assign it to an integer variable.
        When you print this index1, you will see index 1. Because the first 'a' it appear as index 1 of the String.
        If I want to find the index number of the 2nd 'a ': Since this indexOf() method it will return you the first matching ones index number.
        Then you need to make sure that the argument that you give, is only unique to the 2nd 'a '.
        This 'a ' has a space afterwards. So if you give this argument 'a ', this is the only one that is matching in the String.
        Then it is going to return the first characters index number. First it is going to find the matching one, then it will
        return the first characters index number, which is 'a '.
        */
    int index1 = str.indexOf("a"); //1
    int index2 = str.indexOf("a "); //3
    int index3 = str.indexOf("amm"); //10
/* You can add some character to make it unique.
Therefore, it is going to return the first 'a's index number from the String after locating the matching sequence of characters,
that is given in the argument "amm".
Once you find the index number, then it`s going to be easier for you to manipulate the String as well because you don`t have to
count the index number one by one; you can use this indexOf() method to find the index number.
 */
        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);

        int index4 = str.lastIndexOf("a"); //22
        System.out.println(index4);
        /* If I want to find the last 'a's index number, from the String I can call lastIndexOf() method.
        Then I can paste the character, for example 'a'.
        In the lastIndexOf() method will locate the String str from right to left, which means the last 'a' is the matching one.
        Then it return the index number of the last character 'a' as an integer.
         */




    }
}
