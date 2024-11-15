package structural.facade;

public class OrderProcessor {
    private RecommendationService recommendationService;
    private PaymentService paymentService;
    private WarehouseProcessor processor;

    public void process() {
        processor.process();
        recommendationService.recommend();
        paymentService.pay();
    }
}
