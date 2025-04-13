// Question : Best Time to buy and sell stock III(max one transaction allowed)

class Solution {
    public int maximumProfit(int prices[]) {
        int profit = 0;
        int n = prices.length;
        int maxNum = prices[n-1];
        for(int i = n-2; i>= 0; i--){
            if(maxNum <= prices[i]){
                maxNum = prices[i];
            } else {
                profit = Math.max(profit, (maxNum - prices[i]));
            }
        }
        return profit;
    }
}

// T/C : O(n)

// in this approach we are checking the maximum number from the end of the array.
// if the maximum number is less than the current number then we update the maximum number.abstract 
// so this is the maximum number we can sell at.

