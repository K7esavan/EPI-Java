import java.util.*;

public class BuyAndSellStockOnce {

    //optimal
    static int computeMaxProfit(List<Integer> arr) {

        int minimumPriceUponSeeingAllDays = Integer.MAX_VALUE;
        int maximumProfitThatCanbeGainedBySellingInThatDay = 0;

        for(Integer price : arr) {

            minimumPriceUponSeeingAllDays = Math.min(minimumPriceUponSeeingAllDays, price); //minimumPriceUponSeeingAllDays initially have larger value so we find minimum
            maximumProfitThatCanbeGainedBySellingInThatDay = Math.max(maximumProfitThatCanbeGainedBySellingInThatDay, price - minimumPriceUponSeeingAllDays); //subracting minimum price from price and comparing it with maximumProfitThatCanbeGainedBySellingInThatDay
        }

        return maximumProfitThatCanbeGainedBySellingInThatDay;

    }

    public static void main(String args[]){

        System.out.println(
                    getMaxProfit(
                            Arrays.asList(310, 315, 275, 295, 260, 270, 290, 230, 255, 250)
                        )
                );


        System.out.println(
                    computeMaxProfit(
                            Arrays.asList(310, 315, 275, 295, 260, 270, 290, 230, 255, 250)
                        )
                );
    }
}
