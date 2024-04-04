package backend.enums;

import java.util.StringJoiner;

public enum ProductCategory {
    ELECTRONICS,
    FOODS,
    CLOTHES;


    public static String getList(){
        ProductCategory[] values = values();
        StringJoiner joiner = new StringJoiner("\n","=".repeat(10)+"\n","");
        for (ProductCategory value : values) {
            joiner.add((value.ordinal()+1)+". "+value);
        }
        return joiner.toString();
    }
    public static ProductCategory getCategoryByOrdinal(int ordinal){
        ProductCategory[] values = values();
        for (ProductCategory value : values) {
            if (value.ordinal()==(ordinal-1)) return value;
        }
        return null;
    }
}



