package com.hylden90.projectEuler.problem2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import static com.hylden90.projectEuler.problem2.Problem2.sumEvenFibonacciNumbersLowerThan;

public class Problem2Test
{
    @Test
    public void Given15_OutputShouldBe10()
    {
        int input = 15;
        int result = sumEvenFibonacciNumbersLowerThan(input);
        assertTrue(10 == result);
    }
}