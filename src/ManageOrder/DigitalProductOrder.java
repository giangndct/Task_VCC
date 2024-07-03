package ManageOrder;

public class DigitalProductOrder extends Order{
    @Override
    public void process() {
        System.out.println("Processing digital product order " + CustomerName);
    }
}
