package bowling.bowlingdrawing.domain;

public class Player {
    private final String name;
    private final Game game;

    public Player(String name) {
        this.name = name;
        this.game = new Game();
    }

    public void pitch(int pins) {
        game.pitch(pins);
    }
    public Game game() {
        return game;
    }
}
