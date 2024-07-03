import DBConnection.DatabaseConnection;
import ManageOrder.*;
import ManagePayment.ExternalPaymentProcessor;
import ManagePayment.PaymentAdapter;
import ManagePayment.PaymentSystem;

public class Main {
    public static void main(String[] args) {
        //singleton
        DatabaseConnection dbConnection1 = DatabaseConnection.getInstance();
        DatabaseConnection dbConnection2 = DatabaseConnection.getInstance();
        System.out.println(dbConnection1 == dbConnection2);

        dbConnection1.query("SELECT * FROM orders");
        //factory
        Order order = OrderFactory.createOrder("physical");
        order.process();
        //chain
        OrderHandler validationHandler = new ValidationHandler();
        OrderHandler paymentHandler = new PaymentHandler();
        OrderHandler shippingHandler = new ShippingHandler();

        validationHandler.setNextHandler(paymentHandler);
        paymentHandler.setNextHandler(shippingHandler);

        validationHandler.handle(order);
        //adapter
        ExternalPaymentProcessor externalProcessor = new ExternalPaymentProcessor();
        PaymentSystem paymentAdapter = new PaymentAdapter(externalProcessor);
        paymentAdapter.processPayment(100);
    }
}
