public abstract class Player {
    private String name;
    protected int[] guesses;

public Player(String name, int[] guesses){
    this.name = name;
    this.guesses = guesses;
}
    public abstract int makeGuess();
    public String getName(){
        return name;
    }
    public int[] getGuesses(){
        return guesses;
    }
}
