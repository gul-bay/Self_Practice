package day10_StringPractice;

public class StringMethods8b {
    public static void main(String[] args) {

        String url = "www.amazon.com";

        boolean r1 = url.startsWith("www."); //true
        System.out.println(r1);

        boolean r2 = url.endsWith(".com"); //true
        System.out.println(r2);

/* An url is given as a String.
In order to verify if this a valid url, I can use the startsWith() method to check the beginning characters of the url.
The url needs to start with "www."
The first 4 characters of the String url will be compared. If they are equal it returns you true,
If I want to check if this url ends with ".com", you can use the endsWith() method.
From the url String I will call the endsWith() method and I will paste the argument, that I want to compare it with.
It will also return me boolean based on the comparison.

 */








    }
}
