import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        int chance = 5;

        int i, guess;
        while (true) {
            int number = 1 + (int) (100 * Math.random());

            System.out.print("A number is chosen"
                    + " between 1 to 100."
                    + "Guess the number"
                    + " your Chance is Limit (5).");
            for (i = 0; i < chance; i++) {

                System.out.print(
                        "\nGuess the number: ");

                // Take input for guessing
                guess = scanner.nextInt();

                // If the number is guessed
                if (number == guess) {
                    System.out.println(
                            "Congratulations!"
                                    + " You guessed the number.");
                    break;
                } else if (number > guess
                        && i != chance - 1) {
                    System.out.println(
                            "The number is "
                                    + "greater than " + guess);
                } else if (number < guess
                        && i != chance - 1) {
                    System.out.println(
                            "The number is"
                                    + " less than " + guess);
                }
            }

            if (i == chance) {
                System.out.println(
                        "Your chance is over");

                System.out.println(
                        "The number was " + number);
            }
        System.out.println("");
        }
    }
}
