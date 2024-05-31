import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class HumanPlayerTest {
    @Test
    void getNameTest(){
        ArrayList<Integer> guessesHuman = new ArrayList<>();
        HumanPlayer humanPlayer = new HumanPlayer("Lucero", guessesHuman);
        assertEquals("Lucero", humanPlayer.getName(), "Devuelve el nombre del jugador");
    }

    @Test
    void getGuessesTest(){
        ArrayList<Integer> guessesHuman = new ArrayList<>();
        HumanPlayer humanPlayer = new HumanPlayer("Lucero", guessesHuman);
        assertInstanceOf(ArrayList.class, humanPlayer.getGuesses(), "Devuelve un arrayList");
    }

    @Test
    void makeGuessMock(){
        HumanPlayer mockedPlayer = mock(HumanPlayer.class);
        when(mockedPlayer.makeGuess()).thenReturn(60);
        int guess = mockedPlayer.makeGuess();
        assertEquals(60,guess, "Retorna el valor esperado");
        assertInstanceOf(Integer.class, guess, "Retorna un número entero");
    }
}
