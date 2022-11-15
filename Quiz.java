import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        boolean check = true;
        while (check) {
//        Creating an input object to take user input
            Scanner in = new Scanner(System.in);
//        Taking the no. of questions from user
            System.out.println("Enter the number of questions: ");
            int no_of_questions = in.nextInt();
//        creating an array to store answer key i.e. the correct answers
            int[] correct_answer = new int[no_of_questions];
//        Taking the inputs for correct answers;
            System.out.println("Enter the correct answers: ");
            for (int i = 0; i < no_of_questions; i++) {
                int key = in.nextInt();
                correct_answer[i] = key;
            }
//        Taking the users' answers and calculating score.
            int score = 0;
            System.out.println("Enter your answers: ");
            for (int i = 0; i < no_of_questions; i++) {
                int user_answer = in.nextInt();
                if (user_answer == correct_answer[i]) {
                    score++;
                }
            }
            //            Calculating the percentage of correct answers
            float percentage_correct =  ((float)score * 100 / no_of_questions);

//            Printing the results
            System.out.println("Number of answers answered correctly: " + score);
            System.out.println("Percentage: " + percentage_correct);
            System.out.println("\n");
            System.out.println("Grade another quiz? (y/n).");
            String another_quiz = in.next();
            if (another_quiz.charAt(0) == 'n') {
                check = false;
            }
            else {
                System.out.println("\n");
            }

        }
    }
}
