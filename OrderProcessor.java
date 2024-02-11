package maiwand;

public class OrderProcessor {
    private final ShippingCostCalculator costCalculator;

    public OrderProcessor(ShippingCostCalculator costCalculator) {
        this.costCalculator = costCalculator;
    }

    public double calculateTotalCost(Order order) {
        return costCalculator.calculateCost(order) + // Other charges
    }
}
