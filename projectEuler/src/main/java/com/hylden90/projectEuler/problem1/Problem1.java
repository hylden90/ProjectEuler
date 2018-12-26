package com.hylden90.projectEuler.problem1;

public class Problem1
{
    public static int sumMultiplesOf3And5Below(int limit)
    {
        int sum = 0;
        for (int i = 1; i < limit; i++)
        {
            sum += i%3 == 0 || i%5 == 0 ? i : 0;
        }
        return sum;
    }
}