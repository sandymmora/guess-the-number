import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class GuessTheNumberGameTest {

    @Test
    void generateTargetNumber() {
        GuessTheNumberGame guessTheNumberGame = new GuessTheNumberGame();
        int targetNumber = guessTheNumberGame.getTargetNumber();
        assertTrue(targetNumber<=100, "El número generado es menor de 100");
        assertInstanceOf(Integer.class, targetNumber, "Se genera un numero entero");

    }
    /*@Test
    void testCheckGuess(){
        ArrayList<Integer> guessesHuman = new ArrayList<>();
        ArrayList<Integer> guessesComputer = new ArrayList<>();
        ComputerPlayer computerPlayer = new ComputerPlayer("Computer", guessesComputer);
        HumanPlayer mockedHumanPlayer = mock(HumanPlayer.class);
        when(mockedHumanPlayer.makeGuess()).thenReturn(80);

        GuessTheNumberGame guessTheNumberGame = new GuessTheNumberGame();
        boolean checkGuess = guessTheNumberGame.checkGuess(computerPlayer,computerPlayer);

        assertInstanceOf(Boolean.class, GuessTheNumberGame.class);

    }
*/
}