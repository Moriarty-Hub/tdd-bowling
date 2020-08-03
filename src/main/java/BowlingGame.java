public class BowlingGame {

    public int getFrameFinalScore(int[][] scorecard, int frame) {
        return scorecard[frame - 1][0] + scorecard[frame - 1][1];
    }
}
