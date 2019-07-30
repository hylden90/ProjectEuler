package com.hylden90.projectEuler.problem4;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import static com.hylden90.projectEuler.problem4.Problem4.getLargestPalindromeProductFromNDigitNumbers;

public class Problem4Test
{
    @Test
    public void Given2_OutputShouldBe9009()
    {
        int input = 2;
        int result = getLargestPalindromeProductFromNDigitNumbers(input);
        assertTrue(9009 == result);
    }
}