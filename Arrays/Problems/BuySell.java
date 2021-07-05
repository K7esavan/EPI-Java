//this is same as BuyAndsell once
public class BuySell {

    static int getMaxProfit(int []stocks) {

        int minBuyingPrice = Integer.MAX_VALUE;
        int maxSellingPrice = 0;

        for(int price: stocks) {
            minBuyingPrice = Math.min(minBuyingPrice, price);

            //profit gained in that day
            maxSellingPrice = Math.max(maxSellingPrice, price - minBuyingPrice);
        }

        return maxSellingPrice;
    }

    public static void main(String args[]){

        System.out.println(
                getMaxProfit(new int[]{310, 315, 275, 295, 260, 270, 290, 230, 255, 250}));
    }
}
