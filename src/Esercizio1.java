import java.util.List;
import java.util.stream.Collectors;

public class Esercizio1 {
    public static List<Product> getBooksAbove100(List<Product> products) {
        return products.stream()
                .filter(product -> "Books".equals(product.getCategory()) && product.getPrice() > 100)
                .collect(Collectors.toList());
    }
}
