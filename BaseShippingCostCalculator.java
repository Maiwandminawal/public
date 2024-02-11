package maiwand;

public abstract class BaseShippingCostCalculator implements ShippingCostCalculator {
    protected abstract double getBaseCost(Order order);

    @Override
    public double calculateCost(Order order) {
        return getBaseCost(order) + calculateAdditionalCosts(order);
    }

    protected abstract double calculateAdditionalCosts(Order order);
}
