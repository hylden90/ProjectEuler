package com.hylden90.projectEuler.problem2;

public class Problem2
{
    public static int sumEvenFibonacciNumbersLowerThan(int limit)
    {
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        
        int currentFibonacciNumber = 0;
        int evenFibonacciNumbersSum = 0;

        while (currentFibonacciNumber < limit)
        {
            currentFibonacciNumber = fibonacciSeries.next();
            evenFibonacciNumbersSum += currentFibonacciNumber % 2 == 0 ? currentFibonacciNumber : 0;
        }

        return evenFibonacciNumbersSum;
    }

    private static class FibonacciSeries
    {
        int a, b;

        public FibonacciSeries()
        {
            a = 0;
            b = 1;
        }

        public int next()
        {
            int c = b;
            b = b + a;
            a = c;
            return a;
        }
    }
}