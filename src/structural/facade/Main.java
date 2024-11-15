package structural.facade;

public class Main {
    private static final OrderFlowProcessor orderFlowProcessor = new OrderFlowProcessor();

    public static void main(String[] args) {
        orderFlowProcessor.process();
    }
}
