package com.sqa.lab4_2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HealthIndexScoreTest {

    @Test
    @DisplayName("TC001: nominal values")
    void testTC001() {
        HealthIndexScore score = new HealthIndexScore(43, 130, 15);
        assertEquals(7, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, score.getFitnessLevel());
    }

    @Test
    @DisplayName("TC002: VO2 Max = min- (-1) -> invalid, expects exception")
    void testTC002() {
        assertThrows(IllegalArgumentException.class,
                () -> new HealthIndexScore(-1, 130, 15));
    }

    @Test
    @DisplayName("TC003: VO2 Max = min (0)")
    void testTC003() {
        HealthIndexScore score = new HealthIndexScore(0, 130, 15);
        assertEquals(4, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.POOR, score.getFitnessLevel());
    }

    @Test
    @DisplayName("TC004: VO2 Max = min+ (1)")
    void testTC004() {
        HealthIndexScore score = new HealthIndexScore(1, 130, 15);
        assertEquals(4, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.POOR, score.getFitnessLevel());
    }

    @Test
    @DisplayName("TC005: VO2 Max = max- (60)")
    void testTC005() {
        HealthIndexScore score = new HealthIndexScore(60, 130, 15);
        assertEquals(8, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, score.getFitnessLevel());
    }

    @Test
    @DisplayName("TC006: VO2 Max = max (61)")
    void testTC006() {
        HealthIndexScore score = new HealthIndexScore(61, 130, 15);
        assertEquals(9, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, score.getFitnessLevel());
    }

    @Test
    @DisplayName("TC007: VO2 Max = max+ (62)")
    void testTC007() {
        HealthIndexScore score = new HealthIndexScore(62, 130, 15);
        assertEquals(9, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, score.getFitnessLevel());
    }

    @Test
    @DisplayName("TC008: RHR = min- (39) -> invalid, expects exception")
    void testTC008() {
        assertThrows(IllegalArgumentException.class,
                () -> new HealthIndexScore(43, 39, 15));
    }

    @Test
    @DisplayName("TC009: RHR = min (40)")
    void testTC009() {
        HealthIndexScore score = new HealthIndexScore(43, 40, 15);
        assertEquals(11, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, score.getFitnessLevel());
    }

    @Test
    @DisplayName("TC010: RHR = min+ (41)")
    void testTC010() {
        HealthIndexScore score = new HealthIndexScore(43, 41, 15);
        assertEquals(11, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, score.getFitnessLevel());
    }

    @Test
    @DisplayName("TC011: RHR = max- (219)")
    void testTC011() {
        HealthIndexScore score = new HealthIndexScore(43, 219, 15);
        assertEquals(7, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, score.getFitnessLevel());
    }

    @Test
    @DisplayName("TC012: RHR = max (220)")
    void testTC012() {
        HealthIndexScore score = new HealthIndexScore(43, 220, 15);
        assertEquals(7, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, score.getFitnessLevel());
    }

    @Test
    @DisplayName("TC013: RHR = max+ (221) -> invalid, expects exception")
    void testTC013() {
        assertThrows(IllegalArgumentException.class,
                () -> new HealthIndexScore(43, 221, 15));
    }

    @Test
    @DisplayName("TC014: HRR = min- (-1) -> invalid, expects exception")
    void testTC014() {
        assertThrows(IllegalArgumentException.class,
                () -> new HealthIndexScore(43, 130, -1));
    }

    @Test
    @DisplayName("TC015: HRR = min (0)")
    void testTC015() {
        HealthIndexScore score = new HealthIndexScore(43, 130, 0);
        assertEquals(5, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.POOR, score.getFitnessLevel());
    }

    @Test
    @DisplayName("TC016: HRR = min+ (1)")
    void testTC016() {
        HealthIndexScore score = new HealthIndexScore(43, 130, 1);
        assertEquals(5, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.POOR, score.getFitnessLevel());
    }

    @Test
    @DisplayName("TC017: HRR = max- (29)")
    void testTC017() {
        HealthIndexScore score = new HealthIndexScore(43, 130, 29);
        assertEquals(9, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, score.getFitnessLevel());
    }

    @Test
    @DisplayName("TC018: HRR = max (30)")
    void testTC018() {
        HealthIndexScore score = new HealthIndexScore(43, 130, 30);
        assertEquals(9, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, score.getFitnessLevel());
    }

    @Test
    @DisplayName("TC019: HRR = max+ (31)")
    void testTC019() {
        HealthIndexScore score = new HealthIndexScore(43, 130, 31);
        assertEquals(9, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, score.getFitnessLevel());
    }
}