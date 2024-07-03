package ManagePayment;

public class PaymentAdapter implements PaymentSystem{
    private ExternalPaymentProcessor externalProcessor;

    public PaymentAdapter(ExternalPaymentProcessor externalProcessor) {
        this.externalProcessor = externalProcessor;
    }

    @Override
    public void processPayment(double amount) {
        externalProcessor.makePayment(amount);
    }
}
