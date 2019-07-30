package com.hylden90.projectEuler.problem4;

public class Problem4
{
    public static int getLargestPalindromeProductFromNDigitNumbers(int n)
    {
        PalindromeNumberSeries palindromeNumberSeries = new PalindromeNumberSeries(n);
        int palindromeNumber = palindromeNumberSeries.next();
        while(palindromeNumber > 0)
        {
            if (HasTwoFactorsOfNDigits(palindromeNumber, n))
            {
                return palindromeNumber;
            }
            palindromeNumber = palindromeNumberSeries.next();
        }

        return -1;
    }

    private static boolean HasTwoFactorsOfNDigits(int palindromeNumber, int n) 
    {
        int largestNDigitsNumber = (int)Math.pow(10, n) - 1;
        int lowestNDigitsNumber = (int)Math.pow(10, n-1);
        for (int i = largestNDigitsNumber; i >= lowestNDigitsNumber; i--)
        {
            if(palindromeNumber%i == 0)
            {
                if(palindromeNumber/i < largestNDigitsNumber && 
                   palindromeNumber/i > lowestNDigitsNumber)
                    return true;
                if(palindromeNumber/i > largestNDigitsNumber)
                    return false;

            } 
        }
        return false;
    }

    private static class PalindromeNumberSeries
    {
        int currentPalindromeNumber;
        int lowerLimit, upperLimit;

        public PalindromeNumberSeries(int digits)
        {
            lowerLimit = (int)(Math.pow(10, digits-1)*Math.pow(10, digits-1));
            upperLimit = ((int)(Math.pow(10, digits)-1)*((int)Math.pow(10, digits)-1));
            currentPalindromeNumber = upperLimit;
        }

        public int next()
        {
            currentPalindromeNumber = getNextPalindromeNumber();
            return currentPalindromeNumber;
        }

        private int getNextPalindromeNumber()
        {
            int candidate = currentPalindromeNumber-1;
            while(candidate > lowerLimit)
            {
                if (isPalindrome(candidate))
                    return candidate;
                candidate--;
            }
            return -1;
        }

        private boolean isPalindrome(Integer candidate)
        {
            if(candidate.toString().equals(reverseString(candidate.toString())))
                return true;
            return false;
        }

        private String reverseString(String string)
        {
            StringBuilder stringBuilder = new StringBuilder(string);
            stringBuilder = stringBuilder.reverse();
            return stringBuilder.toString();
        }
    }
}