import java.util.ArrayList;

public abstract class Player {
    private String name;
    protected ArrayList<Integer> guesses;


public Player(String name, ArrayList<Integer> guesses){
    this.name = name;
    this.guesses = guesses;
}
    public abstract int makeGuess();
    public String getName(){
        return name;
    }
    public ArrayList<Integer> getGuesses(){
        return guesses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGuesses(ArrayList<Integer> guesses) {
        this.guesses = guesses;
    }
}
