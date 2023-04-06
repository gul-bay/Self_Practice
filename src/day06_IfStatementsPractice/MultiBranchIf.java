package day06_IfStatementsPractice;

public class MultiBranchIf {

    public static void main(String[] args) {

        // Write a program that can check if the given number is positive, negative or zero

        int num = 10;

        String result = "";

        if(num > 0){
            result = "Positive";
        }else if (num < 0){
            result = "Negative";
        }else{
            result = "Zero";
        }
        System.out.println(result);





    }
}
