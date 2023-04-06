package day08_TernaryPractice;

public class Ternary_MultiBranchIf {

    public static void main(String[] args) {

        int number = 10;

        String result;

        if(number>0){
            result = "Positive";
        }else if(number<0){
            result = "Negative";
        }else{
            result = "Zero";
        }
        System.out.println(result);


/*Make sure that the Multi Branch If Statement is returning the same type of value in every single block.
  In the solution above we do have in every single block the same type of value that has been returned.
  The blocks are returning String values -> this if statement we can convert to a Ternary; simplified in one line*/

        System.out.println("---------------------------------------------------------------------------------");

        String result2 = (number>0)?"Positive" :(number<0)? "Negative" : "Zero";

        System.out.println(result2);







    }
}
