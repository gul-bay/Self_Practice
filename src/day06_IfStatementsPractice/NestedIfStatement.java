package day06_IfStatementsPractice;

public class NestedIfStatement {

    public static void main(String[] args) {

        int score = 185; // the score has to be  between 1-100 in order to get Passed or Failed

        if(score >= 1 && score <= 100){  // pre-condition

            if(score >= 60){
                System.out.println("Passed"); // if the pre-condition is true we will get Passed or Failed
            }else{
                System.out.println("Failed");

            }


        }else{
            System.out.println("Invalid Score"); //if the pre-condition is not true we will get Invalid Score
        }







    }
}
