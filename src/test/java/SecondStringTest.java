import model.SecondString;
import org.junit.jupiter.api.Test;

public class SecondStringTest {


@Test
    void returnsIndexOfSecondLetter(){
    String input = "hello";
    char letter = 'l';


    SecondString secondString = new SecondString();


    int actual = secondString.secondSymbol(input, letter);
    int expected = 3;



}




}
