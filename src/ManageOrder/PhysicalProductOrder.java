package ManageOrder;

public class PhysicalProductOrder extends Order {
    @Override
    public void process() {
        System.out.println("Processing physical product order " + CustomerName );
    }
}
