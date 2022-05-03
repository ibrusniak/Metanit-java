
import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;

public class FilterDemo {

    public static void main(String[] args) {

        List<Product> products
            = Arrays.asList(
                new Product(Vendor.NOKIA, "3310", 200),
                new Product(Vendor.XIAOMI, "Mi5", 400),
                new Product(Vendor.NOKIA, "3320", 200),
                new Product(Vendor.SAMSUNG, "S4", 340),
                new Product(Vendor.NOKIA, "3300", 100),
                new Product(Vendor.SAMSUNG, "S3", 640),
                new Product(Vendor.SAMSUNG, "Galaxy Ace", 150),
                new Product(Vendor.XIAOMI, "Mi6", 600),
                new Product(Vendor.XIAOMI, "Redmi Note 10", 1000)
            );

        System.out.println();

        products.stream()
            .forEach(System.out::println);

        System.out.println();

        Predicate<Product> lambdaFilter
            = z -> z.getPrice() >= 100 && z.getPrice() < 600;
        products.stream()
            .filter(lambdaFilter)
            .forEach(System.out::println);
        
        System.out.println();

        int xiaomiPhonesCount
            = (int) products.stream()
                .filter(p -> p.getVendor() == Vendor.XIAOMI)
                .count();

        System.out.println(xiaomiPhonesCount);
    }
}

class Product {

    private String name;
    private Vendor vendor;
    private int price;
    
    public Product(Vendor vendor, String name, int price) {
        this.vendor = vendor;
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
   
    public Vendor getVendor() {
        return vendor;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d",
            vendor, name, price);
    }
}

enum Vendor {
    NOKIA,
    LG,
    SAMSUNG,
    XIAOMI
}



