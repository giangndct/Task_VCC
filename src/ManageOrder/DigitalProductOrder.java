package ManageOrder;

public class DigitalProductOrder implements Order{
    @Override
    public void process() {
        System.out.println("Processing digital product order");
    }
}
