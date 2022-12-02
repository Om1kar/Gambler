package Gambler;

public class BettingGame {
    static int TOTAL_MONEY = 100;
    static int totalMoney = 0;
    static int noOfPlays = 1;
    static int count = 0;
    static int WINNING_AMOUNT = 0;
    static int LOSING_AMOUNT = 0;

    public void startStake() {
        /*
        UC1=> Gambler having 100$
         */
        TOTAL_MONEY = 100;//Total money of Gambler
        int startGame = TOTAL_MONEY - 1;//every game is of 1$
        System.out.println("After first Stake Remaining Money = " + startGame + "$");
    }

    /*
    UC2=>Gambler wins his first bet or either losses
    */

    public void betWinOrLose() {
        while (WINNING_AMOUNT <= 150) {
            //WINNING_AMOUNT++;
            noOfPlays++;
            int betNumber = (int) (Math.floor(Math.random() * 10) % 3);
            count++;
            if (betNumber == 1) {
                WINNING_AMOUNT = TOTAL_MONEY + count;
                System.out.println("Gambler Wins 1$");
                System.out.println("After betting = " + WINNING_AMOUNT + "$");
            } else {
                System.out.println("Gambler Losses 1$");
                LOSING_AMOUNT = TOTAL_MONEY - count;
                System.out.println("Remaining Money = " + LOSING_AMOUNT + "$");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Gambler have 100$ to Bet");
        System.out.println("Gambler's total Money = " + TOTAL_MONEY + "$");
        BettingGame firstStake = new BettingGame();
        firstStake.startStake();
        BettingGame bettingGame = new BettingGame();
        bettingGame.betWinOrLose();
        if (WINNING_AMOUNT >= 150) {
            System.out.println("Gambler wins his 50% amount");
        } else if (LOSING_AMOUNT <= 50) {
            System.out.println("Gambler lost 50% Amount");
        }
        System.out.println("No of Times Gambler plays in a Day = " + noOfPlays);

    }
}
