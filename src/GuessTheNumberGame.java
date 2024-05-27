import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    private int targetNumber;
    private Random random;

    public int getTargetNumber() {
        return this.targetNumber;
    }

    public GuessTheNumberGame() {
        this.random = new Random();
        this.targetNumber = random.nextInt(1, 101);
    }
    private boolean checkGuess(String player){
        int[] array = {};
        int guess;
        if (player.equals("Computer")){
            System.out.println("Turno de la computadora");
            ComputerPlayer computerPlayer = new ComputerPlayer("Computer", array);
            guess = computerPlayer.makeGuess();
        } else {
            System.out.println("Tu turno " + player);
            HumanPlayer humanPlayer = new HumanPlayer(player, array);
            guess = humanPlayer.makeGuess();
        }
        if(guess < targetNumber){
            System.out.println("Mi numero es mayor");
            return false;
        } else if (guess > targetNumber) {
            System.out.println("Mi numero es menor");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Inicia el juego");
        System.out.println("¿Cuál es tu nombre?");
        Scanner scanner = new Scanner(System.in);
        String namePlayer = scanner.nextLine();
        System.out.println("Bienvenid@ " + namePlayer);
        System.out.println("Seleccioné un número al azar entre 1 y 100 por turnos intentarán adivinarlo");
        GuessTheNumberGame guessTheNumberGame = new GuessTheNumberGame();
        String playerInTurn = "humanPlayer";
        boolean checkGuess = false;
        while (!checkGuess) {
            if (playerInTurn.equals("humanPlayer")) {
                checkGuess = guessTheNumberGame.checkGuess(namePlayer);
                playerInTurn = "Computer";
            } else {
                checkGuess = guessTheNumberGame.checkGuess(playerInTurn);
                playerInTurn = "humanPlayer";
            }
        }
        if (playerInTurn.equals("Computer")){
            System.out.println("\uD83C\uDF1FFelicitaciones " + namePlayer + "\uD83C\uDF1F Adivinaste primero el número!!" );
        }else{
            System.out.println(" La computadora ganó");
        }
    }
}