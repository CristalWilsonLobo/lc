import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StockProfitTest {
    
    @Test
    public void testMaxProfit() {
        StockProfit solution = new StockProfit();
        
        // Test case 1: Regular case with a positive profit
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int expected1 = 5; // Buy on day 2 (price = 1) and sell on day 5 (price = 6)
        assertEquals(expected1, solution.maxProfit(prices1));

        // Test case 2: No profit possible
        int[] prices2 = {7, 6, 4, 3, 1};
        int expected2 = 0; // No transactions are done, i.e., max profit = 0
        assertEquals(expected2, solution.maxProfit(prices2));

        // Test case 3: Increasing prices
        int[] prices3 = {1, 2, 3, 4, 5};
        int expected3 = 4; // Buy on day 1 (price = 1) and sell on day 5 (price = 5)
        assertEquals(expected3, solution.maxProfit(prices3));

        // Test case 4: Only one price point
        int[] prices4 = {1};
        int expected4 = 0; // Not enough data to make a transaction
        assertEquals(expected4, solution.maxProfit(prices4));

        // Test case 5: Mixed prices with multiple opportunities
        int[] prices5 = {2, 4, 1, 7, 5, 3, 6};
        int expected5 = 6; // Buy on day 3 (price = 1) and sell on day 4 (price = 7)
        assertEquals(expected5, solution.maxProfit(prices5));

        // Test case 6: Prices are the same every day
        int[] prices6 = {3, 3, 3, 3, 3};
        int expected6 = 0; // No profit as all prices are the same
        assertEquals(expected6, solution.maxProfit(prices6));

        // Test case 7: Random prices with an early profit
        int[] prices7 = {1, 2, 10, 1, 2};
        int expected7 = 9; // Buy on day 1 (price = 1) and sell on day 3 (price = 10)
        assertEquals(expected7, solution.maxProfit(prices7));

        // Test case 8: High price at the end
        int[] prices8 = {2, 1, 4, 5, 2, 9, 7};
        int expected8 = 8; // Buy on day 2 (price = 1) and sell on day 6 (price = 9)
        assertEquals(expected8, solution.maxProfit(prices8));
    }
}
