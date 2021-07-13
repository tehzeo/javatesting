package player;
public class Player {

    private    player.Dice dice;
    private int minNumberToWin;

    public Player(   player.Dice dice, int minNumberToWin) {
        this.dice = dice;
        this.minNumberToWin = minNumberToWin;
    }

    public boolean play() {
        int diceNumber = dice.roll();
        return diceNumber > minNumberToWin;
    }
}
