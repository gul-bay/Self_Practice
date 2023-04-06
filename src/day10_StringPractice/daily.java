package day10_StringPractice;

public class daily {
    public static void main(String[] args) {

        String name = "  chuck norris ";

        name = name.trim().toUpperCase();

       // name = name.charAt(0) +  "." + name.charAt(6) + ".";

        name = name.charAt(0) + "." + name.charAt(name.indexOf(' ')+1) + ".";

        System.out.println(name);




        String s1 = "abc";
        String s2 = "abc";
        System.out.println("s1 == s2 is: " + s1 == s2);


    }


}
