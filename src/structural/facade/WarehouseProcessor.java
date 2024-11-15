package structural.facade;

public class WarehouseProcessor {
    private final InventoryService inventoryService;
    private final AnalyticsService analyticsService;

    public WarehouseProcessor() {
        inventoryService = new InventoryService();
        analyticsService = new AnalyticsService();
    }

    public void process() {
        inventoryService.checkInventory();
        analyticsService.track();
    }
}
