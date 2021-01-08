package edu.xja.entity;

public class UserOrder {
    private Integer id;
    private String ordersn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrdersn() {
        return ordersn;
    }

    public void setOrdersn(String ordersn) {
        this.ordersn = ordersn;
    }
    @Override
    public String toString() {
        return "UserOrder[id=" + id + ",ordersn=" + ordersn + "]";
    }
}
