package constructor;

public class Main {
    public static void main(String[] args) {

        Product product = new Product(123456789, "Laptop","Cesper Excalıbur",270000,2);
        //product.setName("Laptop");
        // product.setId(123456789);
        // product.setDescription("Cesper Excelıbur");
        // product.setPrice(270000);
        // product.setStockAmount(2);


        System.out.println(product.getName());
        System.out.println(product.getDescription());
        System.out.println(product.getPrice());
        System.out.println(product.getStockAmount());
        System.out.println(product.getKod());
    }
}
