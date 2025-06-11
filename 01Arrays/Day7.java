// Question : Best Time to Buy and sell stock II (multiple transactions allowed)


class Solution {
    public int maximumProfit(int prices[]) {
        int result = 0;
        int n = prices.length;
        for(int i = 1; i<n; i++){
            if(prices[i] > prices[i - 1]) {
                result = result + prices[i] - prices[i - 1];
            }
        }
        return result;
    }
}

// TC: O(n)

// it is a greedy approach where we are checking if the next price is greater than the current price,
// if it is then  we add the differences to the result.
// if it is not then we do nothing and move to the next price.
// this is beacause we are allowed to buy and sell as many times as we want.
// so we can buy at the lowest prices and sell at the highest prices.