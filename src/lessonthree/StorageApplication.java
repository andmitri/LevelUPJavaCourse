package lessonthree;

public class StorageApplication {

    public static void main(String[] args) {
        Storage storage = new Storage();

        storage.add("Phone", 103.53);

        Product newProduct = new Product();
        newProduct.name = "Laptop";
        newProduct.weight = 2563;
        newProduct.setupCount(3);

        storage.add(newProduct);

        Product laptop = new Product();
        laptop.name = "Laptop";
        laptop.weight = 2563;
        laptop.setupCount(3);

        Product acer = laptop;

        acer.setupCount(10);
        boolean isCountEqual = acer.count == laptop.count;

    }

}
