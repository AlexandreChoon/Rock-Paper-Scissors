public class Player {
    private int roundWins = 0;
    private String name;


    public Player(String name1) {
        name = name1;
    }
    public int getRoundWins() {
        return roundWins;
    }

    public String getName() {
        return name;
    }



    public RockPaperScissors choose() {
        return RockPaperScissors.choose();
    }
}
