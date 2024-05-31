import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class ComputerPlayerTest {
    @Test
    void getGuesses() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ComputerPlayer computerPlayer = new ComputerPlayer("Computer", arrayList);
        assertInstanceOf(ArrayList.class, computerPlayer.getGuesses());
    }
    @Test
    void computerMakeGuess(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        ComputerPlayer computerPlayer = new ComputerPlayer("Computadora", arrayList);
        int guessComputer = computerPlayer.makeGuess();
        assertInstanceOf(Integer.class, guessComputer,"Devuelve un numero entero");
        assertTrue(guessComputer <= 100 & guessComputer >= 1, "El numero que devuelve es entre 1 y 100");

    }
}
