package maiwand;

public class StandardShippingCostCalculator extends BaseShippingCostCalculator {
    @Override
    protected double getBaseCost(Order order) {
        return order.getTotalWeight() * 0.5;
    }

    @Override
    protected double calculateAdditionalCosts(Order order) {
        // Implement logic for additional costs based on distance, etc.
        return 0;
    }
}
