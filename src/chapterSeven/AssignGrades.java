package chapterSeven;

import java.util.Scanner;

public class AssignGrades {
   private int bestScore;
    int[] studentScore;
    int i;

    public int bestGrade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Total Number of Student: ");
        int studentNumber = scanner.nextInt();
        int score;
        studentScore = new int[studentNumber];

        bestScore = studentScore[0];

        System.out.println("Enter student score: ");
        for (i = 0; i < studentScore.length; i++) {
            score = scanner.nextInt();
            studentScore[i] = score;
            if (studentScore[i] > bestScore) {
                bestScore = studentScore[i];

            }
        }

        return bestScore;
    }


                    public void getGrades() {
                        String grade = "";

                        for (i=0;i<studentScore.length;i++){

                            if (studentScore[i] >= bestScore - 10) {
                                grade = "A";
                            } else if (studentScore[i] >= bestScore - 20) {
                                grade = "B";
                            } else if (studentScore[i] >= bestScore - 30) {
                                grade = "C";
                            } else if (studentScore[i] >= bestScore - 40) {
                                grade = "D";
                            } else
                                grade = "F";

                            System.out.println(studentScore[i]+" "+ grade);
                        }

                    }

    public static void main(String[] args) {
        AssignGrades assignGrades = new AssignGrades();
        System.out.println("Best Score is: "+ assignGrades.bestGrade());
        assignGrades.getGrades();

    }
}