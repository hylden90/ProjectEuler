package com.hylden90.projectEuler.problem1;

import static com.hylden90.projectEuler.problem1.Problem1.sumMultiplesOf3And5Below;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Problem1Test
{
    @Test
    public void Given10_OutputShouldBe23()
    {
        int input = 10;
        int result = sumMultiplesOf3And5Below(input);
        assertTrue(23 == result);
    }

}