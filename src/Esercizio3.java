import java.util.List;
import java.util.stream.Collectors;

public class Esercizio3 {
    public static List<Product> getBoysProductsWithDiscount(List<Product> products) {
        return products.stream()
                .filter(product -> "Boys".equals(product.getCategory()))
                .peek(product -> product.setPrice(product.getPrice() * 0.9))
                .collect(Collectors.toList());
    }
}
