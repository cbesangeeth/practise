package GroceryShop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductType {

    static List<ProductType> AVAILABLE_Product_Types = new ArrayList<>();

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductType(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    static {
        AVAILABLE_Product_Types.addAll(
                Arrays.asList(
                new ProductType(1l, "Eatables"),
                new ProductType(2l, "Daily Usable"),
                new ProductType(3l, "Cosmetic")));
    }

    static ProductType getProductTypeById(long productTypeId){

        ProductType productType = null;
        for(int i=0 ;i< AVAILABLE_Product_Types.size(); i++){
            if(AVAILABLE_Product_Types.get(i).getId() == productTypeId){
                productType = AVAILABLE_Product_Types.get(i);
            }
        }

        return productType;
    }
}
