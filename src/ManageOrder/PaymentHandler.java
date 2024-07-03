package ManageOrder;

public class PaymentHandler extends OrderHandler{
    @Override
    public void handle(Order order) {
        System.out.println("Processing payment " + order.getOrderId());
        if (nextHandler != null) {
            nextHandler.handle(order);
        }
    }
}
