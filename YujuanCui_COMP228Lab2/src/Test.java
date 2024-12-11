import javax.swing.JOptionPane;
import java.util.Random;

public class Test {

    private String[] questions = {
            "Which of the following is not a Java Edition?",
            "What is the main purpose of the Java Class Libraries?",
            "Which tool is used to compile Java code?",
            "What does JDK stand for?",
            "Which method serves as the entry point for a Java application?"
    };

    private String[][] options = {
            {"Java SE", "Java ME", "Java BE", "Java EE"},
            {"To provide runtime environment", "To store libraries", "To compile code", "To provide pre-written classes for developers"},
            {"Eclipse", "JVM", "JDK", "javac"},
            {"Java Development Kit", "Java Debugging Kit", "Java Design Kit", "Java Document Kit"},
            {"public static main(String[] args)", "public static void main(String[] args)", "void main()", "public void main(String args)"}
    };

    private int[] answers = {2, 3, 3, 0, 1};

    private int correctCount = 0;
    private int incorrectCount = 0;
    Random random = new Random();

    private String simulateQuestion(int questionIndex) {
        String question = questions[questionIndex];
        String[] choices = options[questionIndex];
        return JOptionPane.showInputDialog(null, question, "Java Test",
                JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]).toString();
    }

    private void checkAnswer(int questionIndex, String userAnswer) {
        int correctAnswerIndex = answers[questionIndex];
        if (options[questionIndex][correctAnswerIndex].equals(userAnswer)) {
            correctCount++;
            generateMessage(true);
        } else {
            incorrectCount++;
            generateMessage(false);
            JOptionPane.showMessageDialog(null, "Correct answer: " + options[questionIndex][correctAnswerIndex]);
        }
    }

    private void generateMessage(boolean isCorrect) {
        int randomNumber = random.nextInt(4);

        String message;
        if (isCorrect) {

            switch (randomNumber) {
                case 0:
                    message = "Excellent!";
                    break;
                case 1:
                    message = "Good!";
                    break;
                case 2:
                    message = "Keep up the good work!";
                    break;
                case 3:
                    message = "Nice work!";
                    break;
                default:
                    message = "Well done!";
                    break;
            }
        } else {

            switch (randomNumber) {
                case 0:
                    message = "No. Please try again.";
                    break;
                case 1:
                    message = "Wrong. Try once more.";
                    break;
                case 2:
                    message = "Don't give up!";
                    break;
                case 3:
                    message = "No. Keep trying.";
                    break;
                default:
                    message = "Keep working!";
                    break;
            }
        }
        JOptionPane.showMessageDialog(null, message);
    }

    public void inputAnswer() {
        for (int i = 0; i < questions.length; i++) {
            String userAnswer = simulateQuestion(i);
            checkAnswer(i, userAnswer);
        }
        displayResults();
    }

    private void displayResults() {
        double percentage = (correctCount / (double) questions.length) * 100;
        JOptionPane.showMessageDialog(null, "Correct Answers: " + correctCount +
                "\nIncorrect Answers: " + incorrectCount +
                "\nPercentage: " + percentage + "%");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.inputAnswer();
    }
}
