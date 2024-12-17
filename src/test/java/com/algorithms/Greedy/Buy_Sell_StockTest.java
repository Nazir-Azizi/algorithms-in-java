package com.algorithms.Greedy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class Buy_Sell_StockTest {
    /*
     * Testing Buy_Sell_Stock algorithm with
     * many tests
     */
    Buy_Sell_Stock algo;
    /*
     * 
     */
    @Before
    public void setUp(){
        algo = new Buy_Sell_Stock();
    }

    @Test
    public void test1(){
        int[] prices = {1,2,3,4,5};
        assertEquals(4, algo.maxProfit(prices));
    }
    @Test
    public void test2(){
        int[] prices = {5,4,3,2,1};
        assertEquals(0, algo.maxProfit(prices));
    }
    @Test
    public void test3(){
        int[] prices = {6,0,10};
        assertEquals(10, algo.maxProfit(prices));
    }
    @Test
    public void test4(){
        int[] prices = {1,2,9,8,15};
        assertEquals(15, algo.maxProfit(prices));
    }
}
