package ManageOrder;

public abstract class Order {
    protected  String OrderId;
    protected  String CustomerName;

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public abstract void process();
}
