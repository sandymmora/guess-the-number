import java.util.Scanner;

public class HumanPlayer extends Player {
    public HumanPlayer(String name, int[] guesses) {
        super(name, guesses);
    }
    public int makeGuess(){
        System.out.println("Ingresa un número");
        Scanner numberHumanPlayer = new Scanner(System.in);
        int numberGamer = numberHumanPlayer.nextInt();
        return numberGamer;
    }
}
