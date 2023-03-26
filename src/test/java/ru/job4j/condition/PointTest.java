package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when50to30then2() {
        double expected = 2;
        Point a = new Point(5, 0);
        Point b = new Point(3, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when123to234then32dot57() {
        double expected = 32.57;
        Point a = new Point(12, 3);
        Point b = new Point(2, 34);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when2631to164then41dot40() {
        double expected = 41.40;
        Point a = new Point(26, 31);
        Point b = new Point(1, 64);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when11to22then1dot41() {
        double expected = 1.41;
        Point a = new Point(1, 1);
        Point b = new Point(2, 2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}