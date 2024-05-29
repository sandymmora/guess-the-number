import java.util.ArrayList;
import java.util.Scanner;

public class HumanPlayer extends Player {
    public HumanPlayer(String name, ArrayList<Integer> guesses) {
        super(name, guesses);
    }
    public int makeGuess(){
        System.out.println("Ingresa un número");
        Scanner numberHumanPlayer = new Scanner(System.in);
        int numberGamer = numberHumanPlayer.nextInt();
        getGuesses().add(numberGamer);
        return numberGamer;
    }
}
