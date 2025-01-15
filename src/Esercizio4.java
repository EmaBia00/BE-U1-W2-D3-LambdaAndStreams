import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Esercizio4 {
    public static List<Product> getProductsForTier2Customers(List<Order> orders) {
        LocalDate startDate = LocalDate.of(2021, 2, 1);
        LocalDate endDate = LocalDate.of(2021, 4, 1);

        return orders.stream()
                .filter(order -> order.getCustomer().getTier() == 2 &&
                        !order.getOrderDate().isBefore(startDate) &&
                        !order.getOrderDate().isAfter(endDate))
                .flatMap(order -> order.getProducts().stream())
                .distinct()
                .collect(Collectors.toList());
    }
}
