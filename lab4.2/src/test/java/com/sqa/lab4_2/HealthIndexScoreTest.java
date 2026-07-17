package com.sqa.lab4_2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HealthIndexScoreTest {

    @Test
    @DisplayName("TC001: nominal values")
    void testTC001() {
        HealthIndexScore score = new HealthIndexScore(43, 130, 21);
        assertEquals(8, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, score.getFitnessLevel());
    }

    @Test
    @DisplayName("TC002: VO2 Max = min- (24)")
    void testTC002() {
        HealthIndexScore score = new HealthIndexScore(24, 130, 21);
        assertEquals(5, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.POOR, score.getFitnessLevel());
    }

    @Test
    @DisplayName("TC003: VO2 Max = min (25)")
    void testTC003() {
        HealthIndexScore score = new HealthIndexScore(25, 130, 21);
        assertEquals(6, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, score.getFitnessLevel());
    }

    @Test
    @DisplayName("TC004: VO2 Max = min+ (26)")
    void testTC004() {
        HealthIndexScore score = new HealthIndexScore(26, 130, 21);
        assertEquals(6, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, score.getFitnessLevel());
    }

    @Test
    @DisplayName("TC005: VO2 Max = max- (59)")
    void testTC005() {
        HealthIndexScore score = new HealthIndexScore(59, 130, 21);
        assertEquals(9, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, score.getFitnessLevel());
    }

    @Test
    @DisplayName("TC006: VO2 Max = max (60)")
    void testTC006() {
        HealthIndexScore score = new HealthIndexScore(60, 130, 21);
        assertEquals(9, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, score.getFitnessLevel());
    }

    @Test
    @DisplayName("TC007: VO2 Max = max+ (61)")
    void testTC007() {
        HealthIndexScore score = new HealthIndexScore(61, 130, 21);
        assertEquals(10, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, score.getFitnessLevel());
    }

    @Test
    @DisplayName("TC008: RHR = min- (39)")
    void testTC008() {
        HealthIndexScore score = new HealthIndexScore(43, 39, 21);
        assertEquals(12, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.EXCELLENT, score.getFitnessLevel());
    }

    @Test
    @DisplayName("TC009: RHR = min (40)")
    void testTC009() {
        HealthIndexScore score = new HealthIndexScore(43, 40, 21);
        assertEquals(12, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.EXCELLENT, score.getFitnessLevel());
    }

    @Test
    @DisplayName("TC010: RHR = min+ (41)")
    void testTC010() {
        HealthIndexScore score = new HealthIndexScore(43, 41, 21);
        assertEquals(12, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.EXCELLENT, score.getFitnessLevel());
    }

    @Test
    @DisplayName("TC011: RHR = max- (219)")
    void testTC011() {
        HealthIndexScore score = new HealthIndexScore(43, 219, 21);
        assertEquals(8, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, score.getFitnessLevel());
    }

    @Test
    @DisplayName("TC012: RHR = max (220)")
    void testTC012() {
        HealthIndexScore score = new HealthIndexScore(43, 220, 21);
        assertEquals(8, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, score.getFitnessLevel());
    }

    @Test
    @DisplayName("TC013: RHR = max+ (221)")
    void testTC013() {
        HealthIndexScore score = new HealthIndexScore(43, 221, 21);
        assertEquals(8, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, score.getFitnessLevel());
    }

    @Test
    @DisplayName("TC014: HRR = min- (11)")
    void testTC014() {
        HealthIndexScore score = new HealthIndexScore(43, 130, 11);
        assertEquals(5, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.POOR, score.getFitnessLevel());
    }

    @Test
    @DisplayName("TC015: HRR = min (12)")
    void testTC015() {
        HealthIndexScore score = new HealthIndexScore(43, 130, 12);
        assertEquals(7, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, score.getFitnessLevel());
    }

    @Test
    @DisplayName("TC016: HRR = min+ (13)")
    void testTC016() {
        HealthIndexScore score = new HealthIndexScore(43, 130, 13);
        assertEquals(7, score.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, score.getFitnessLevel());
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