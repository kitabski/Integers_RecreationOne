package com.kit;

import java.util.ArrayList;
import java.util.List;

public class SumSquaredDivisors {
    public static String listSquared(long m, long n) {

        StringBuffer result = new StringBuffer();
        result.append("[");
        double sumOfDivisors = 0.0;

        if (m==1)
            result.append("[1, 1], ");

        for (long i = m; i <=n ; i++) {         // Iterating through each given number (m)

            for (int j = 1; j <= i; j++) {      // Finding divisors and squaring them
                if (i%j==0){
                    sumOfDivisors+=Math.pow(j, 2);        // Store the sum of devisors
                }
            }
            if (Math.sqrt(sumOfDivisors)%2 == 0.0) {      // if sum of divisors can be squarerooted, this is our gay!
                result.append("["+ i + ", " + String.valueOf((int)sumOfDivisors) + "], ");
            }
            sumOfDivisors=0.0;
        }
        result.append("]");
        if (result.length()>2){
            result.deleteCharAt(result.length()-2);
            result.deleteCharAt(result.length()-2);
        }

        String res = result.toString();
        return res;
    }
}
