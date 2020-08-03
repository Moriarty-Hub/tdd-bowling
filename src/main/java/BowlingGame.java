public class BowlingGame {

    public int getFrameFinalScore(int[][] scorecard, int frame) {
        if (scorecard[frame - 1][0] == 10) {
            return 10 + scorecard[frame][0] + scorecard[frame][1];
        }
        return scorecard[frame - 1][0] + scorecard[frame - 1][1];
    }
}
