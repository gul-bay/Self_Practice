package day08_TernaryPractice;

public class Ternary_NestedIf {

    public static void main(String[] args) {

        int score = 185;

        String result;

        if(score >=0 && score <=100){
            if(score>=60){
                result = "Passed";
            }else{
                result = "Failed";
            }
        }else{
            result = "Invalid Score";
        }
        System.out.println(result);

        /*Make sure that every single blocks in the If Statement are returning the same type of values
          The If block and Else block they all returning String values; there are 3 possible String values in total
          If yor apply Ternary just like the first If Statement (pre-condition), only one of them will be returned*/
        System.out.println("------------------------------------------------------------------------------------------");

        //How can I complete this task by using Ternary?

        String result2 =(score >=0 && score <=100) ? (score>=60) ?  "Passed" : "Failed" : "Invalid Score";

        System.out.println(result2);

        /*We followed step by step, first the If Conditions and then the else Conditions to convert this Nested If into the Ternary.
         Usually it is not recommended to you apply Ternary to the Tasks, where you used the Nested If.
         Nested If is more readable.*/











    }
}
