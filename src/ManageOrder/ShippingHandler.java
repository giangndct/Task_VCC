package ManageOrder;

public class ShippingHandler extends OrderHandler {

    @Override
    public void handle(Order order) {
        System.out.println("Shipping order");
        if (nextHandler != null) {
            nextHandler.handle(order);
        }
    }
}
