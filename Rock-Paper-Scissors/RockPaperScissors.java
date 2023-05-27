public enum RockPaperScissors {
    ROCK,
    PAPER,
    SCISSORS,
    SPOCK,
    LIZARD;

    public static void start(int rounds, Player p1, Player p2, String name1, String name2,int roundW1,int roundW2) {
        boolean winner = false;
        for (int i = 0; i < rounds; i++) {
            System.out.println("ROCK, PAPER, SCISSORS, SHOOT!!");
            RockPaperScissors p1choice = p1.choose();
            RockPaperScissors p2choice = p2.choose();
            String result = RockPaperScissors.compare(p1choice, p2choice, name1, name2);
            if (result.equals("tie")) {
                System.out.println(name1 + ": " + p1choice + "      " + name2 + ": " + p2choice);
                System.out.println("You have tied this round!!");
                i--;
            } else if (result.equals("p1")) {
                System.out.println(name1 + ": " + p1choice + "      " + name2 + ": " + p2choice);
                System.out.println(name1 + " won round with: " + p1choice);
                roundW1++;
                if (roundW1 == rounds / 2 + 1) {
                    System.out.println(name1 + " Winner Winner Chicken Dinner");
                    winner = true;
                    break;
                }
            } else if (result.equals("p2")) {
                System.out.println(name1 + ": " + p1choice + "      " + name2 + ": " + p2choice);
                System.out.println(name2 + " won round with: " + p2choice);
                roundW2++;
                if (roundW2 == rounds / 2 + 1) {
                    System.out.println(name2 + " Winner Winner Chicken Dinner");
                    winner = true;
                    break;
                }
            }

        }
        if (winner == false) {
            roundW1 = 0;
            roundW2 = 0;
            System.out.println("There's a tie, do one more round!");
            start(1, p1, p2, name1, name2,roundW1,roundW2);

        }

    }
    public static RockPaperScissors choose() {
        int choice = (int) Math.ceil(Math.random() * 5);
        if (choice == 1) {
            return ROCK;
        } else if (choice == 2) {
            return PAPER;
        } else if (choice == 3) {
            return SCISSORS;
        }else if (choice == 4 ){
            return SPOCK;
        }else if (choice==5){
            return LIZARD;
        }
        return ROCK;
    }

    public static String compare(RockPaperScissors p1choice, RockPaperScissors p2choice, String name1, String name2) {
        if (p1choice == p2choice) {
            return "tie";
        } else if ((p1choice == ROCK || p2choice == ROCK) && (p1choice == PAPER || p2choice == PAPER)) {
            if (p1choice == PAPER) {
                //System.out.println(name1 + " wins with paper");
                return "p1";
            } else {
                //System.out.println(name2 + " wins with paper");
                return "p2";
            }
        } else if ((p1choice == PAPER || p2choice == PAPER) && (p1choice == SCISSORS || p2choice == SCISSORS)) {
            if (p1choice == SCISSORS) {
                //System.out.println(name1 + " wins with Scissor");
                return "p1";
            } else {
                //System.out.println(name2 + " wins with Scissor");
                return "p2";
            }
        } else if ((p1choice == SCISSORS || p2choice == SCISSORS) && (p1choice == ROCK || p2choice == ROCK)) {
            if (p1choice == ROCK) {
                //System.out.println(name1 + " wins round with Rock");
                return "p1";
            } else {
                //System.out.println(name2 + " wins with Rock");
                return "p2";

            }
        }else if ((p1choice == SPOCK || p2choice ==SPOCK) && (p1choice == ROCK || p2choice == ROCK)) {
            if (p1choice == SPOCK) {
                //System.out.println(name1 + " wins round with Rock");
                return "p1";
            } else {
                //System.out.println(name2 + " wins with Rock");
                return "p2";

            }
        }else if ((p1choice == SCISSORS || p2choice == SCISSORS) && (p1choice == SPOCK || p2choice == SPOCK)) {
            if (p1choice == SPOCK) {
                //System.out.println(name1 + " wins round with Rock");
                return "p1";
            } else {
                //System.out.println(name2 + " wins with Rock");
                return "p2";

            }
        }else if ((p1choice == SPOCK || p2choice == SPOCK) && (p1choice == PAPER || p2choice == PAPER)) {
            if (p1choice == PAPER) {
                //System.out.println(name1 + " wins round with Rock");
                return "p1";
            } else {
                //System.out.println(name2 + " wins with Rock");
                return "p2";

            }
        }else if ((p1choice == LIZARD || p2choice == LIZARD) && (p1choice == SPOCK || p2choice == SPOCK)) {
            if (p1choice == LIZARD) {
                //System.out.println(name1 + " wins round with Rock");
                return "p1";
            } else {
                //System.out.println(name2 + " wins with Rock");
                return "p2";

            }
        }else if ((p1choice == LIZARD || p2choice == LIZARD) && (p1choice == ROCK || p2choice == ROCK)) {
            if (p1choice == ROCK) {
                //System.out.println(name1 + " wins round with Rock");
                return "p1";
            } else {
                //System.out.println(name2 + " wins with Rock");
                return "p2";

            }
        }else if ((p1choice == SCISSORS || p2choice == SCISSORS) && (p1choice == LIZARD || p2choice == LIZARD)) {
            if (p1choice == SCISSORS) {
                //System.out.println(name1 + " wins round with Rock");
                return "p1";
            } else {
                //System.out.println(name2 + " wins with Rock");
                return "p2";

            }
        }else if ((p1choice == LIZARD || p2choice == LIZARD) && (p1choice == PAPER || p2choice == PAPER)) {
            if (p1choice == LIZARD) {
                //System.out.println(name1 + " wins round with Rock");
                return "p1";
            } else {
                //System.out.println(name2 + " wins with Rock");
                return "p2";

            }
        }
        return "error";
    }//could have done all of the wins for p1 in one if and if none worked p2 wins
}