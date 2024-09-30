import javax.swing.JOptionPane;
import java.util.Random;

public class Lotto {
    private int[] lottoNumbers = new int[3];
    Random random = new Random();

    public Lotto() {
        for (int i = 0; i < lottoNumbers.length; i++) {
            lottoNumbers[i] = random.nextInt(9) + 1;
        }
    }

    public int getSum() {
        int sum = 0;
        for (int num : lottoNumbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int userNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter a number between 3 and 27: "));
        boolean userWon = false;

        for (int i = 0; i < 5; i++) {
            Lotto lotto = new Lotto();
            int sum = lotto.getSum();
            JOptionPane.showMessageDialog(null, "Lotto numbers sum: " + sum);

            if (userNumber == sum) {
                JOptionPane.showMessageDialog(null, "You win!");
                userWon = true;
                break;
            }
        }

        if (!userWon) {
            JOptionPane.showMessageDialog(null, "Computer wins!");
        }
    }
}

