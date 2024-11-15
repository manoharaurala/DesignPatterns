package structural.facade;

public class Main {
    private static final OrderManager orderManager = new OrderManagerImpl();

    public static void main(String[] args) {
        orderManager.createOrder();
    }
}
