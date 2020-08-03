public class BowlingGame {

    private static final int BASE_SCORE_OF_STRIKE_OR_SPARE = 10;

    public int getFrameFinalScore(int[][] scorecard, int frame) {
        if (frame == 10 && isSpare(scorecard[frame - 1])) {
            return scorecard[frame - 1][0] + scorecard[frame - 1][1] + scorecard[frame - 1][2];
        }
        if (frame == 10 && isStrike(scorecard[frame - 1])) {
            return scorecard[frame - 1][0] + scorecard[frame - 1][1] + scorecard[frame - 1][2];
        }
        if (isSpare(scorecard[frame - 1])) {
            return BASE_SCORE_OF_STRIKE_OR_SPARE + scorecard[frame][0];
        }
        if (isStrike(scorecard[frame - 1])) {
            return BASE_SCORE_OF_STRIKE_OR_SPARE + scorecard[frame][0] + scorecard[frame][1];
        }
        return scorecard[frame - 1][0] + scorecard[frame - 1][1];
    }

    private boolean isStrike(int[] scoreOfFrame) {
        return scoreOfFrame[0] == 10;
    }

    private boolean isSpare(int[] scoreOfFrame) {
        return scoreOfFrame[0] != 10 && scoreOfFrame[0] + scoreOfFrame[1] == 10;
    }
}
