package structural.facade;

public class OrderManagerImpl implements OrderManager {
    private final OrderProcessor orderProcessor;

    public OrderManagerImpl() {
        orderProcessor = new OrderProcessor();
    }

    @Override
    public void createOrder() {
        // Store it in db

        // Async
        orderProcessor.process();
    }

    // God class - not maintainable
// Testing
// Extensibility
//
}
