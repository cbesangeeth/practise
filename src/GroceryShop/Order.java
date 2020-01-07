package GroceryShop;

import java.util.List;

public class Order {

    private Long id;
    private Long userId;
    private Float totalBill;
    private Float totalDiscountAmount;
    private Float finalBill;
    private Float discount;

    public Order(List<UserProduct> userProducts) {

        this.totalBill = 0f;

        userProducts.stream().forEach(userProduct -> {
            this.totalBill = this.totalBill + userProduct.getPrice();
        });

        this.discount = Discount.getDiscountPercentage(this.totalBill);
        this.totalDiscountAmount = Discount.calculateByDiscountPercentage(this.discount, this.totalBill);
        this.finalBill = totalBill - totalDiscountAmount;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Float getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(Float totalBill) {
        this.totalBill = totalBill;
    }

    public Float getTotalDiscountAmount() {
        return totalDiscountAmount;
    }

    public void setTotalDiscountAmount(Float totalDiscountAmount) {
        this.totalDiscountAmount = totalDiscountAmount;
    }

    public Float getFinalBill() {
        return this.totalBill - this.totalDiscountAmount;
    }

    public void setFinalBill(Float finalBill) {
        this.finalBill = finalBill;
    }

    public void addTotalBillAmount(Float productPrice){
        this.totalBill = this.getTotalBill() + productPrice;
    }

    @Override
    public String toString() {

        StringBuffer sb = new StringBuffer();

        sb      .append("Total Bill")
                .append("\t")
                .append(totalBill)
                .append("\n")
                .append("Discount(" + discount+ ")")
                .append("\t")
                .append(totalDiscountAmount)
                .append("\n")
                .append("Total")
                .append("\t")
               .append(finalBill);

        return sb.toString();

    }
}
