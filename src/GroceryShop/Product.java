package GroceryShop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Product {

    private Long itemCode;
    private String name;
    private Long typeId;
    private Float price;

    public Long getItemCode() {
        return itemCode;
    }

    public void setItemCode(Long itemCode) {
        this.itemCode = itemCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Product(Long itemCode, String name, Long typeId, Float price) {
        this.itemCode = itemCode;
        this.name = name;
        this.typeId = typeId;
        this.price = price;
    }

    static List<Product> AVAILABLE_PRODUCTS = new ArrayList<>();

    static {

        AVAILABLE_PRODUCTS.addAll(Arrays.asList(
                new Product(00001l, "Cocount oil", 1l, 200.00f),
                new Product(00002l, "Rice", 1l, 60.00f),
                new Product(00004l, "Dhal", 1l, 120.50f),
                new Product(00005l, "Tooth Paste", 2l, 45.25f),
                new Product(00006l, "Makeup kit", 3l, 300.00f)
        ));
    }

    static Product getProductById(Long productId){
        Product product = null;

        product = AVAILABLE_PRODUCTS.stream().filter(product1 -> product1.getItemCode() == productId).findFirst().get();

       /* for(int i=0 ;i< AVAILABLE_PRODUCTS.size(); i++){
            if(AVAILABLE_PRODUCTS.get(i).itemCode == productId){
                product = AVAILABLE_PRODUCTS.get(i);
            }
        }*/

        return product;
    }

}
