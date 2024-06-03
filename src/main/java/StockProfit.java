import java.util.Arrays;

class StockProfit {
    public int maxProfit(int[] prices) {
/*
        int buy=prices.length,sell=1, profit = 0, min_buy = Integer.MAX_VALUE , max_sell = 0;
        while(buy>=0 && sell < prices.length && buy<sell){
            min_buy = Math.min(min_buy,prices[buy]);
            max_sell = Math.max(max_sell,prices[sell]);
            
            profit=Math.max(profit,prices[sell]-prices[buy]);
            buy--;
        }
    return profit;
*/
    	
        int currentProfit = 0;
        int maxProfit = 0;

        for(int i=0;i<prices.length-1;i++)
        {
            int buy = prices[i];
            int temp[] = Arrays.copyOfRange(prices, (i+1), prices.length);
            // Sort to get highest selling day
            Arrays.sort(temp);
            int sell = temp[temp.length-1];
            currentProfit = sell - buy;
            // Compare
            if(currentProfit>maxProfit)
            {
                maxProfit = currentProfit;
            }
        }
        return maxProfit;
        /*
        int buy = Ints.indexOf(prices,temp[0]);
        int sell =0;
        if(buy==prices.length-1)
        {
        	return 0;
        }
        else
        {
        	int temp1[] = Arrays.copyOfRange(prices, buy, prices.length );
        	sell = Ints.indexOf(prices,temp1[prices.length-1]);
        }
        if(sell-buy > 0)
        {
        	return sell-buy;
        }
        return 0;
    	*/
    }
}
