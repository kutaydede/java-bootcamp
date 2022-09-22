package classesWithAttributes;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Laptop";
        product.id = 123456789;
        product.description = "Cesper Excelıbur";
        product.price = 270000;
        product.stockAmount = 2;

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.name);
        System.out.println(product.id);
        System.out.println(product.description);
        System.out.println(product.price);
        System.out.println(product.stockAmount);
    }
}
