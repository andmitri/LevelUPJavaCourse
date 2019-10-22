package lessonfive;

public class Product {

    private String name;
    private int vendorCode;

    public Product(String name, int vendorCode) {
        this.name = name;
        this.vendorCode = vendorCode;
    }

    @Override
    public int hashCode() {

        int result = 31;

        result = result * 31 + vendorCode;
        result = result * 31 + name.hashCode();

        return result;
    }


}
