package ManageOrder;

public class PhysicalProductOrder implements Order {
    @Override
    public void process() {
        System.out.println("Processing physical product order");
    }
}
