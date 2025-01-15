import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Example data
        List<Product> products = Arrays.asList(
                new Product(1L, "Book A", "Books", 150.0),
                new Product(2L, "Toy A", "Baby", 50.0),
                new Product(3L, "Shirt A", "Boys", 100.0),
                new Product(4L, "Book B", "Books", 90.0)
        );

        List<Order> orders = Arrays.asList(
                new Order(1L, "Shipped", LocalDate.of(2021, 3, 15), LocalDate.of(2021, 3, 20), products, new Customer(1L, "John Doe", 2)),
                new Order(2L, "Pending", LocalDate.of(2021, 1, 15), LocalDate.of(2021, 1, 20), products, new Customer(2L, "Jane Doe", 1))
        );

        // Esercizio 1
        System.out.println("Esercizio 1: " + Esercizio1.getBooksAbove100(products));

        // Esercizio 2
        System.out.println("Esercizio 2: " + Esercizio2.getOrdersWithBabyProducts(orders));

        // Esercizio 3
        System.out.println("Esercizio 3: " + Esercizio3.getBoysProductsWithDiscount(products));

        // Esercizio 4
        System.out.println("Esercizio 4: " + Esercizio4.getProductsForTier2Customers(orders));
    }
}
