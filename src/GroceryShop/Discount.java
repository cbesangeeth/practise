package GroceryShop;

public class Discount {


    static float getDiscountPercentage(Float totalAmount) {

        float discountPercentage = 0l;

        if (totalAmount >= 1000 && totalAmount < 2000) {
            discountPercentage = 2f;
        } else if (totalAmount >= 2000) {
            discountPercentage = 5f;
        }

        return discountPercentage;
    }


    public static Float calculateByDiscountPercentage(Float discount, Float totalBill) {

        if(discount != null && totalBill != null){
            return totalBill * discount / 100;
        }

        return 0f;
    }
}
