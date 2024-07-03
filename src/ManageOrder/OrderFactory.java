package ManageOrder;

public class OrderFactory {
    public static Order createOrder(String orderType) {
        switch (orderType.toLowerCase()) {
            case "physical":
                return new PhysicalProductOrder();
            case "digital":
                return new DigitalProductOrder();
            default:
                throw new IllegalArgumentException("Unknown order type");
        }
    }
}
