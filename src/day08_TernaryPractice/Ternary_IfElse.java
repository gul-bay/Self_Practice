package day08_TernaryPractice;

public class Ternary_IfElse {
    public static void main(String[] args) {

        int score = 75;

        String result;

        if(score >= 60){
            result = "Passed";
            /*make sure that every single block in this if statement is returning the same type of value
              2 possible values that this if statement is returning right now
              both of them are returning String values, which means this If Statement now can be converted to the Ternary (makes it shorter)*/
        }else{
            result = "Failed";
        }

        System.out.println(result);
//Only one of the block gets executed. When one block gets executed the String value will be assigned to the String variable
        System.out.println("----------------------------------------------------------------------------------------------");

        String result2 = (score >= 60) ? "Passed" : "Failed";

        System.out.println(result2);

        //At the end Ternary will return you one of these values
        //The If and else Statement above is simplified into one line. Advantage of the Ternary.















    }
}
