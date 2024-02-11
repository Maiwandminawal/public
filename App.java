
package maiwand;
import maiwand.*;
import java.util.*;

import OrderProcessor;
import ShippingCostCalculator;
import StandardShippingCostCalculator;

public class Main {

    public static void main(String[] args) {
        Order order = new Order();
        ShippingCostCalculator standardCalculator = new StandardShippingCostCalculator();
        OrderProcessor processor = new OrderProcessor(standardCalculator);
        double totalCost = processor.calculateTotalCost(order);
        System.out.println("Total cost with standard shipping: " + totalCost);
    }
}
