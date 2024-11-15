package structural.facade;

public class OrderProcessor {
    private final RecommendationService recommendationService;
    private final PaymentService paymentService;
    private final WarehouseProcessor processor;

    public OrderProcessor() {
        recommendationService = new RecommendationService();
        paymentService = new PaymentService();
        processor = new WarehouseProcessor();
    }

    public void process() {
        processor.process();
        recommendationService.recommend();
        paymentService.pay();
    }
}
