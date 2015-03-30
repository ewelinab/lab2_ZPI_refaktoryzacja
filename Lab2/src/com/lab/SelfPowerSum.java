package com.lab;

import java.math.BigInteger;

/**
 * Created by ewna on 2015-03-30.
 */
public class SelfPowerSum {
    /**
     * Calculates the sum of series of self power elements (from 1 to n).
     * 1^1 + 2^2 + 3^3 + ... + n^n
     * @param n - number of elements
     * @return sum reduced to ten digits
     */
    public static String calculate10DigitsFromSeries(int n)
    {
        BigInteger sum = new BigInteger("0");
        for(int i = 1; i <= n; ++i){
            sum = sum.add(getSelfPower(i));
        }
        return getLast10Digits(sum);
    }

    private static BigInteger getSelfPower(int number)
    {
        return new BigInteger(Integer.toString(number)).pow(number);
    }

    private static String getLast10Digits(BigInteger number){
        String numAsString = number.toString();
        return numAsString.substring(numAsString.length() - 10);
    }
}
