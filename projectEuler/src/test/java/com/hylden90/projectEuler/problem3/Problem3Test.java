package com.hylden90.projectEuler.problem3;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import static com.hylden90.projectEuler.problem3.Problem3.getLargestPrimeFactor;

public class Problem3Test
{
    @Test
    public void Given13195_OutputShouldBe29()
    {
        long input = 13195;
        int result = getLargestPrimeFactor(input);
        assertTrue(29 == result);
    }
}