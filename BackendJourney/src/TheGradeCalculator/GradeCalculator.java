package TheGradeCalculator;

public class GradeCalculator {
    public static void main(String[] args) {

        int sum = 0;
        // array of integers representing student scores
        int[] scores = {85,92,45,67,99};

        //iterate through the scores
        for(int score: scores){
            if(score >= 90){
                System.out.println(score + "-> A");
            } else if (score >= 80) {
                System.out.println(score + "-> B");
            } else if (score >= 70) {
                System.out.println(score + "-> C");
            }else if( score<70){
                System.out.println(score +"-> Fail");
            }

            sum += score;
        }

        //average score of class
        int avg = sum/scores.length;
        System.out.println("The average score is: " + avg);
    }
}
