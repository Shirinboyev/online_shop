package frontEnd;


import backend.enums.ProductCategory;

public class MainUI {
    public static void main(String[] args) {
        String list = ProductCategory.getList();
        System.out.println(list);
    }
}
