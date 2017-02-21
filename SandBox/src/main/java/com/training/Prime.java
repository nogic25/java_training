package com.training;

/**
 * Created by anastasiyam on 2/19/2017.
 */
public class Prime {
    // find whether number is prime or not
    public static boolean isPrime(int n) {

        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) {
                return false;

            }
        }
        return true;
    }

    public static boolean isPrimeWhile(int n) {
        //function will be executed a lot faster.
int m=(int) Math.sqrt(n);
        int i = 2;
        while (i < m) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
