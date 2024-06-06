import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StockProfitTest {

    @Test
    public void testMaxProfit_RegularCase() {
        StockProfit solution = new StockProfit();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int expected = 5; // Buy on day 2 (price = 1) and sell on day 5 (price = 6)
        assertEquals(expected, solution.maxProfit(prices));
    }

    @Test
    public void testMaxProfit_NoProfitPossible() {
        StockProfit solution = new StockProfit();
        int[] prices = {7, 6, 4, 3, 1};
        int expected = 0; // No transactions are done, i.e., max profit = 0
        assertEquals(expected, solution.maxProfit(prices));
    }

    @Test
    public void testMaxProfit_IncreasingPrices() {
        StockProfit solution = new StockProfit();
        int[] prices = {1, 2, 3, 4, 5};
        int expected = 4; // Buy on day 1 (price = 1) and sell on day 5 (price = 5)
        assertEquals(expected, solution.maxProfit(prices));
    }

    @Test
    public void testMaxProfit_OnlyOnePricePoint() {
        StockProfit solution = new StockProfit();
        int[] prices = {1};
        int expected = 0; // Not enough data to make a transaction
        assertEquals(expected, solution.maxProfit(prices));
    }

    @Test
    public void testMaxProfit_MixedPricesWithMultipleOpportunities() {
        StockProfit solution = new StockProfit();
        int[] prices = {2, 4, 1, 7, 5, 3, 6};
        int expected = 6; // Buy on day 3 (price = 1) and sell on day 4 (price = 7)
        assertEquals(expected, solution.maxProfit(prices));
    }

    @Test
    public void testMaxProfit_PricesTheSameEveryDay() {
        StockProfit solution = new StockProfit();
        int[] prices = {3, 3, 3, 3, 3};
        int expected = 0; // No profit as all prices are the same
        assertEquals(expected, solution.maxProfit(prices));
    }

    @Test
    public void testMaxProfit_RandomPricesWithEarlyProfit() {
        StockProfit solution = new StockProfit();
        int[] prices = {1, 2, 10, 1, 2};
        int expected = 9; // Buy on day 1 (price = 1) and sell on day 3 (price = 10)
        assertEquals(expected, solution.maxProfit(prices));
    }

    @Test
    public void testMaxProfit_HighPriceAtTheEnd() {
        StockProfit solution = new StockProfit();
        int[] prices = {2, 1, 4, 5, 2, 9, 7};
        int expected = 8; // Buy on day 2 (price = 1) and sell on day 6 (price = 9)
        assertEquals(expected, solution.maxProfit(prices));
    }
}
