package com.hackerrank.codingchallenges;

public class StockBuyer {



    public static int maxProfit(int[] prices) {

        //Initialize three integers

        //One to hold the lowest price from prices
        int leastValue = Integer.MAX_VALUE;

        //One to hold the value of the highest possible profit
        int maxProfit = 0;

        //One to hold the profit if the stock is sold at the current price (prices[i])
        int todayProfit;

        //Iterate prices...
        for (int i = 0; i < prices.length; i++) {

            //If the price at i is less than the leastValue, set leastValue to that price at i
            if(prices[i] < leastValue){
                leastValue = prices[i];
            }

            //Now, we set the profit for today to be the difference between the price at i and the leastValue
            todayProfit = prices[i] - leastValue;

            //If the maxProfit is less than the profit for today, update the maxProfit
            if(maxProfit < todayProfit){
                maxProfit = todayProfit;
            }
        }
        return maxProfit;
    }


    public static void main(String[] args) {

        int[] prices = new int[5];
        prices[0] = 7;
        prices[1] = 1;
        prices[2] = 6;
        prices[3] = 3;
        prices[4] = 5;
    }
}









