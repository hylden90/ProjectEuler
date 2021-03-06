package com.hylden90.projectEuler;

import static com.hylden90.projectEuler.problem1.Problem1.sumMultiplesOf3And5Below;
import static com.hylden90.projectEuler.problem2.Problem2.sumEvenFibonacciNumbersLowerThan;
import static com.hylden90.projectEuler.problem3.Problem3.getLargestPrimeFactor;
import static com.hylden90.projectEuler.problem4.Problem4.getLargestPalindromeProductFromNDigitNumbers;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int problem1Answer = sumMultiplesOf3And5Below(1000); //233168
        int problem2Answer = sumEvenFibonacciNumbersLowerThan(4000000);
        int problem3Answer = getLargestPrimeFactor(600851475143L);
        int problem4Answer = getLargestPalindromeProductFromNDigitNumbers(3);
    }
}
