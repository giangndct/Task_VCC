package ManageOrder;

public class ValidationHandler extends OrderHandler{
    @Override
    public void handle(Order order) {
        System.out.println("Validating order");
        if (nextHandler != null) {
            nextHandler.handle(order);
        }
    }
}
