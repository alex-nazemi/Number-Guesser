package number_guesser;

public class NumberGuesser {

    Integer numberToGuess;

    public NumberGuesser(Integer numberToGuess) {
        this.numberToGuess = numberToGuess;
    }

    public String guess(Integer guess) {
        if (guess.equals(numberToGuess)) {
            return "Congratulations you guessed the number correctly, you win!";
        } else if (guess < numberToGuess) {
            return "higher";
        } else {
            return "lower";
        }
    }









}
