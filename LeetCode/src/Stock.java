
/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class Stock {
	public int maxProfit(int[] prices) {
        if(prices.length == 0){
            return 0;
        }
        int max_diff = 0,min = prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i] < min){
                min = prices[i];
            }
            if(max_diff < prices[i]-min){
                max_diff = prices[i]-min;
            }
        }
        return max_diff;
    }
}
