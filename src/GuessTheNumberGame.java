import java.util.ArrayList;
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
    private boolean checkGuess(Player player, ComputerPlayer computerPlayer){
        int guess = player.makeGuess();
        if(guess < targetNumber){
            System.out.println("Mi numero es mayor");
            computerPlayer.setStartRange(guess+1);
            return false;
        } else if (guess > targetNumber) {
            System.out.println("Mi numero es menor");
            computerPlayer.setEndRange(guess);
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        //Iniciar el juego
        System.out.println("Inicia el juego");
        System.out.println("¿Cuál es tu nombre?");
        Scanner scanner = new Scanner(System.in);
        String namePlayer = scanner.nextLine();
        //Crear instancias de jugadores
        ArrayList<Integer> guessesHuman = new ArrayList<>();
        ArrayList<Integer> guessesComputer = new ArrayList<>();
        ComputerPlayer computerPlayer = new ComputerPlayer("Computer", guessesComputer);
        HumanPlayer humanPlayer = new HumanPlayer(namePlayer, guessesHuman);
        System.out.println("Bienvenid@ " + humanPlayer.getName());
        System.out.println("Seleccioné un número al azar entre 1 y 100 por turnos intentarán adivinarlo");
        GuessTheNumberGame guessTheNumberGame = new GuessTheNumberGame();
        String playerInTurn = "humanPlayer";
        boolean checkGuess = false;
        while (!checkGuess) {
            if (playerInTurn.equals("Computer")){
                System.out.println("Turno de la computadora...");
                checkGuess = guessTheNumberGame.checkGuess(computerPlayer,computerPlayer);
                playerInTurn = "humanPlayer";
            } else {
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("Tu turno " + humanPlayer.getName());
                checkGuess = guessTheNumberGame.checkGuess(humanPlayer,computerPlayer);
                playerInTurn = "Computer";
            }
        }
        if (playerInTurn.equals("Computer")){
            System.out.println("\uD83C\uDF1F Felicitaciones " + namePlayer + "\uD83C\uDF1F Adivinaste primero el número!!" );
            System.out.println("Tu historial de suposiciones: " + humanPlayer.getGuesses());
        }else{
            System.out.println("❉ La computadora ganó ❉");
            System.out.println("Historial de suposiciones de la computadora: "+ computerPlayer.getGuesses());
        }
    }
}
