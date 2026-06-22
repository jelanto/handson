import java.util.Arrays;

public class SearchDemo {

    static Product linearSearch(Product[] products, int id) {
        for (Product p : products) {
            if (p.productId == id) {
                return p;
            }
        }
        return null;
    }

    static Product binarySearch(Product[] products, int id) {

        int left = 0, right = products.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (products[mid].productId == id)
                return products[mid];

            if (products[mid].productId < id)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mobile", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories")
        };

        Product result = linearSearch(products, 103);
        System.out.println("Linear Search: " + result.productName);

        Arrays.sort(products, (a, b) -> a.productId - b.productId);

        result = binarySearch(products, 103);
        System.out.println("Binary Search: " + result.productName);
    }
}