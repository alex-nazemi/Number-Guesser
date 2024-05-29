// app/src/test/java/number_guesser/NumberGuesserTest.java
package number_guessor;

import number_guesser.NumberGuesser;
import org.junit.Assert;
import org.junit.Test;

public class NumberGuesserTest {
    @Test
    public void testGuessingTooLowReturnsHigher() {
        NumberGuesser game = new NumberGuesser(10);
        // note that the expected value comes first
        // if it helps, imagine Yoda saying "higher, it should be"
        Assert.assertEquals("higher", game.guess(5));
    }
    @Test
    public void testGuessingTooHighReturnsLower() {
        NumberGuesser game = new NumberGuesser(10);
        // note that the expected value comes first
        // if it helps, imagine Yoda saying "higher, it should be"
        Assert.assertEquals("lower", game.guess(15));
    }
    @Test
    public void testGuessingCorrectNumberReturnsCorrect() {
        NumberGuesser game = new NumberGuesser(10);
        // note that the expected value comes first
        // if it helps, imagine Yoda saying "higher, it should be"
        Assert.assertEquals("Congratulations you guessed the number correctly, you win!", game.guess(10));
    }
}
