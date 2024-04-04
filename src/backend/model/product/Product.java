package backend.model.product;



import backend.enums.ProductCategory;
import backend.model.BaseModel;

import java.math.BigDecimal;

public class Product extends BaseModel {
    private String name;
    private BigDecimal price;
    private int count;
    private ProductCategory category;

    public Product(String name, BigDecimal price, int count, ProductCategory category) {
        this.name = name;
        this.price = price;
        this.count = count;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return  name + " " + price+ " "  + count +" " + category;
    }
}
