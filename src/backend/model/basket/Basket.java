package backend.model.basket;

import backend.model.BaseModel;

public class Basket extends BaseModel {
    private String userId;
    private boolean isPaid;

    private int countOfOrders;

    public Basket(String userId, boolean isPaid) {
        this.userId = userId;
        this.isPaid = isPaid;
        this.countOfOrders = 0;
    }

    public int getCountOfOrders() {
        return countOfOrders;
    }

    public void setCountOfOrders(int countOfOrders) {
        this.countOfOrders = countOfOrders;
    }

    public String getUserId() {
        return userId;
    }


    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }
}
