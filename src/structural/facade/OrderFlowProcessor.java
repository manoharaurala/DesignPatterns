package structural.facade;

public class OrderFlowProcessor {
    private final PaymentService paymentService = new PaymentService();
    private final InventoryService inventoryService = new InventoryService();
    private final RecommendationService recommendationService = new RecommendationService();
    private final AnalyticsService analyticsService = new AnalyticsService();

    public void process() {
        paymentService.pay();
        // update
        inventoryService.checkInventory();
        // analytics
        recommendationService.recommend();
        analyticsService.track();
    }
}
