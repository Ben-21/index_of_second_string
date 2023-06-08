import model.SecondString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SecondStringTest {


    @Test
    void returnsIndexOfSecondLetter() {
        String input = "hello";
        char letter = 'l';


        SecondString secondString = new SecondString();


        int actual = secondString.secondSymbol(input, letter);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
 @Test
    void returnsminus1_whenNoLetterInString() {
        String input = "Stringaufgabe";
        char letter = 'l';


        SecondString secondString = new SecondString();


        int actual = secondString.secondSymbol(input, letter);
        int expected = -1;

        Assertions.assertEquals(expected, actual);
    }
@Test
    void returnsminus1_whenOneLetterInString() {
        String input = "Stringaufgabe";
        char letter = 'n';


        SecondString secondString = new SecondString();


        int actual = secondString.secondSymbol(input, letter);
        int expected = -1;

        Assertions.assertEquals(expected, actual);
    }
}
