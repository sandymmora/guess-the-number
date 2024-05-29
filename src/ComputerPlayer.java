import java.util.ArrayList;
import java.util.Random;

public class ComputerPlayer extends Player {
    private Random random;
    private int startRange = 1;
    private int endRange = 101;

    public int getStartRange(){
        return startRange;
    }

    public void setStartRange(int startRange){
        this.startRange = startRange;
    }

    public int getEndRange(){
        return endRange;
    }

    public void setEndRange(int endRange){
        this.endRange = endRange;
    }

    public ComputerPlayer(String name, ArrayList<Integer> guesses){
        super(name, guesses);
    }

    public int makeGuess()  {
        random = new Random();
        int numberRandom = random.nextInt(startRange,endRange);
        getGuesses().add(numberRandom);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("✦ La computadora eligió el número: " + numberRandom + " ✦");
        return numberRandom;
    }
}
