package GroceryShop;


import java.util.Objects;

public class Tax {

    private Long id;
    private Long typeId;
    private Float percentage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Float getPercentage() {
        return percentage;
    }

    public void setPercentage(Float percentage) {
        this.percentage = percentage;
    }

    static float getTaxAmount(Long productTypeId){
        float tax = 0f;

        ProductType productType = ProductType.getProductTypeById(productTypeId);

        if(Objects.isNull(productType)){
            return tax;
        }

        if (productType.getName().equalsIgnoreCase("Eatables")){
            tax = 5f;
        } else if(productType.getName().equalsIgnoreCase("Daily Usable")){
            tax = 8f;
        } else if(productType.getName().equalsIgnoreCase("Cosmetic")){
            tax = 15f;
        }

        return tax;
    }

}
