package GroceryShop;

public class UserProduct {

    private Long id;
    private User user;
    private Product product;
    private Float quantity;
    private Float taxAmount;
    private Float price;


    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    public Float getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Float taxAmount) {
        this.taxAmount = taxAmount;
    }


    public UserProduct() {

    }

    static UserProduct addUserProduct(User user, Long productId, Float quantity){

        UserProduct userProduct = new UserProduct();
        Product product = Product.getProductById(productId);
        float productTax = Tax.getTaxAmount(product.getTypeId());

        float taxAmount = Discount.calculateByDiscountPercentage(productTax, product.getPrice() * quantity);
        userProduct.setProduct(product);
        userProduct.setQuantity(quantity);
        userProduct.setTaxAmount(taxAmount);
        userProduct.setUser(user);
        userProduct.setPrice((quantity * product.getPrice()) + taxAmount);

        return userProduct;
    }

    public Float getProductPrice(){
        return this.getProduct().getPrice();
    }

    public Long getProductItemCode(){
        return this.getProduct().getItemCode();
    }


    @Override
    public String toString() {


        StringBuffer sb = new StringBuffer();

        sb.append(product.getItemCode())
                .append("\t")
                .append(product.getName())
                .append("\t")
                .append(quantity)
                .append("\t")
                .append(product.getPrice())
                .append("\t")
                .append(taxAmount)
                .append("\t")
                .append(price);

        return sb.toString();

    }
}
