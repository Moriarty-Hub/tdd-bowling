import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {

    @Test
    void should_return_the_score_of_this_frame_when_calculate_score_of_failed_to_knock_down_all_pins() {
        BowlingGame bowlingGame = new BowlingGame();
        int[][] scorecard = new int[][] {{3, 4}, {2, 6}, {1, 1}, {10, 0}, {2, 2}, {4, 6}, {5, 4}, {4, 1}, {1, 2}, {4, 2, 0}};
        int score = bowlingGame.getFrameFinalScore(scorecard, 2);
        assertEquals(8, score);
    }

    @Test
    void should_return_the_score_sum_of_this_frame_and_next_two_throws_when_calculate_score_of_strike() {
        BowlingGame bowlingGame = new BowlingGame();
        int[][] scorecard = new int[][] {{3, 4}, {2, 6}, {1, 1}, {10, 0}, {2, 2}, {4, 6}, {5, 4}, {4, 1}, {1, 2}, {4, 2, 0}};
        int score = bowlingGame.getFrameFinalScore(scorecard, 4);
        assertEquals(14, score);
    }

}
