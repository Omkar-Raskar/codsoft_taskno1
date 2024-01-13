import java.util.Scanner;

public class NumberGame {

    public static void guessNumberGame() {
        Scanner sc = new Scanner(System.in);
        int K = 5;
        int initialScore = 50;

        while (true) {
            int number = 1 + (int)(100 * Math.random());
            int attempts = 0;

            System.out.println("A number is chosen between 1 to 100. Guess the number within 5 attempts.");

            for (int i = 0; i < K; i++) {
                System.out.println("Guess the number:");
                int guess = sc.nextInt();
                attempts++;

                if (number == guess) {
                    int score = initialScore - 10 * (attempts - 1);
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts. Your score is: " + score);
                    break;
                } else if (number > guess && i != K - 1) {
                    System.out.println("The number is greater than " + guess);
                } else if (number < guess && i != K - 1) {
                    System.out.println("The number is less than " + guess);
                }
            }

            if (attempts == K) {
                System.out.println("You have exhausted " + K + " trials.");
                System.out.println("The number was " + number);
            }

            System.out.println("Do you want to play again? (yes/no):");
            String playAgain = sc.next().toLowerCase();

            if (!playAgain.equals("yes")) {
                break;
            }
        }

        System.out.println("Thank you for playing!");
    }

    public static void main(String arg[]) {
        guessNumberGame();
    }
}
