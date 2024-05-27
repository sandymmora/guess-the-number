import java.util.Random;

public class ComputerPlayer extends Player {
    private Random random;
    public ComputerPlayer(String name, int[] guesses){
        super(name, guesses);
    }

    public int makeGuess()  {
        random = new Random();
        int numberRandom = random.nextInt(1,101);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("✦✦ La computadora eligió el número: " + numberRandom );
        return numberRandom;
    }

}
