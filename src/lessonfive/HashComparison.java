package lessonfive;

public class HashComparison {

    public static void main(String[] args) {
        Product[] products = new Product[] {
                new Product("", 12345),
                new Product("", 67891),
                new Product("", 13456),
                new Product("", 23415),
                new Product("", 67893),
        };
        Product forComparison = new Product("", 67893);
        for (int i = 0; i < products.length; i++) {
            if (products[i].hashCode() == forComparison.hashCode()) {
                if (products[i].equals(forComparison)) {
                    System.out.println("Element has index " + i);
                }
            }
        }
    }

}
