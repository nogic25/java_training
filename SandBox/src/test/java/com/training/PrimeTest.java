package com.training;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by anastasiyam on 2/19/2017.
 */

public class PrimeTest {

    @Test
    public void TestPrimes(){

        Assert.assertTrue(Prime.isPrime(Integer.MAX_VALUE));
    }
    @Test
    public void TestNoPrimes(){

        Assert.assertFalse(Prime.isPrime(Integer.MAX_VALUE-2));
    }
}

