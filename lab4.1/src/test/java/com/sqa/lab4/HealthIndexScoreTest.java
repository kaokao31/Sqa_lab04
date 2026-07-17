package com.sqa.lab4;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HealthIndexScoreTest {
    @Test
    @DisplayName("TC001: nominal values")
    void testTC001() {
        HealthIndexScore score = new HealthIndexScore(43, 130, 15);
        assertEquals(7, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, score.getFitnessLevel());
    }
    @Test
    @DisplayName("TC002: VO2 Max = min (0)")
    void testTC002() {
        HealthIndexScore score = new HealthIndexScore(0, 130, 15);
        assertEquals(4, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.POOR, score.getFitnessLevel());
    }
    @Test
    @DisplayName("TC003: VO2 Max = min+ (1)")
    void testTC003() {
        HealthIndexScore score = new HealthIndexScore(1, 130, 15);
        assertEquals(4, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.POOR, score.getFitnessLevel());
    }
    @Test
    @DisplayName("TC004: VO2 Max = max- (60)")
    void testTC004() {
        HealthIndexScore score = new HealthIndexScore(60, 130, 15);
        assertEquals(8, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, score.getFitnessLevel());
    }
    @Test
    @DisplayName("TC005: VO2 Max = max (61)")
    void testTC005() {
        HealthIndexScore score = new HealthIndexScore(61, 130, 15);
        assertEquals(9, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, score.getFitnessLevel());
    }
    @Test
    @DisplayName("TC006: RHR = min (40)")
    void testTC006() {
        HealthIndexScore score = new HealthIndexScore(43, 40, 15);
        assertEquals(11, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, score.getFitnessLevel());
    }
    @Test
    @DisplayName("TC007: RHR = min+ (41)")
    void testTC007() {
        HealthIndexScore score = new HealthIndexScore(43, 41, 15);
        assertEquals(11, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, score.getFitnessLevel());
    }
    @Test
    @DisplayName("TC008: RHR = max- (219)")
    void testTC008() {
        HealthIndexScore score = new HealthIndexScore(43, 219, 15);
        assertEquals(7, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, score.getFitnessLevel());
    }
    @Test
    @DisplayName("TC009: RHR = max (220)")
    void testTC009() {
        HealthIndexScore score = new HealthIndexScore(43, 220, 15);
        assertEquals(7, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, score.getFitnessLevel());
    }
    @Test
    @DisplayName("TC010: HRR = min (0)")
    void testTC010() {
        HealthIndexScore score = new HealthIndexScore(43, 130, 0);
        assertEquals(5, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.POOR, score.getFitnessLevel());
    }
    @Test
    @DisplayName("TC011: HRR = min+ (1)")
    void testTC011() {
        HealthIndexScore score = new HealthIndexScore(43, 130, 1);
        assertEquals(5, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.POOR, score.getFitnessLevel());
    }
    @Test
    @DisplayName("TC012: HRR = max- (29)")
    void testTC012() {
        HealthIndexScore score = new HealthIndexScore(43, 130, 29);
        assertEquals(9, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, score.getFitnessLevel());
    }
    @Test
    @DisplayName("TC013: HRR = max (30)")
    void testTC013() {
        HealthIndexScore score = new HealthIndexScore(43, 130, 30);
        assertEquals(9, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, score.getFitnessLevel());
    }
}