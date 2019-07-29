package com.hylden90.projectEuler.problem3;

public class Problem3
{
    public static int getLargestPrimeFactor(long number)
    {
        PrimeNumberSeries primeNumberSeries = new PrimeNumberSeries();
        int primeNumber, largestPrimeFactor = 0;
        long product = number;
        while(product > 1)
        {
            primeNumber = primeNumberSeries.next();
            if (product % primeNumber == 0)
            {
                largestPrimeFactor = primeNumber;
                do
                    product = product / primeNumber;
                while (product % primeNumber == 0);
            }
        }

        return largestPrimeFactor;
    }

    private static class PrimeNumberSeries
    {
        int currentPrimeNumber;

        public PrimeNumberSeries()
        {
            currentPrimeNumber = 2;
        }

        public int next()
        {
            int returnValue = currentPrimeNumber;
            currentPrimeNumber = getNextPrimeNumber();
            return returnValue;
        }

        private int getNextPrimeNumber()
        {
            int candidate = currentPrimeNumber + 1;
            while(true)
            {
                if (isPrime(candidate))
                    return candidate;
                candidate++;
            }
        }

        private boolean isPrime(int candidate)
        {
            double limit = Math.sqrt((double)candidate);
            for (int i = 2; i <= limit; i++)
            {
                if (candidate % i == 0)
                    return false;
            }
            return true;
        }
    }
}