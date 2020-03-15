package com.codurance.championship;

import org.junit.Test;

import java.util.List;

import static java.util.Collections.singletonList;
import static org.junit.Assert.assertEquals;

public class PointsCalculatorShould {

    @Test
    public void return_a_score_of_three_points_for_one_match_team_x_won() {
        final List<String> points = singletonList("3:1");
        final PointsCalculator calculator = new PointsCalculator();

        final int actual = calculator.score(points);

        assertEquals(3, actual);
    }

}
