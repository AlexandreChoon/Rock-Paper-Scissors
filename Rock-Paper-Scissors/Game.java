public class Game {
    public static void main(String[] args) {
        Player p1 = new Player("Alexandre");
        Player p2 = new Player("João");
        //System.out.println(RockPaperScissors.choose());
        String name1 = p1.getName();
        String name2 = p2.getName();
        int roundW1 = p1.getRoundWins();
        int roundW2 = p2.getRoundWins();
        RockPaperScissors.start(3, p1, p2, name1, name2,roundW1,roundW2);

    }
}
