
public class Main {

    public static void main(String[] args) {
        Product product = new Product(1,"Laptop","Lenovo",5000,3,"red");
        product.setName("Laptop"); 
        product.setId(1); 
        product.setDescription("Lenovo"); 
        product.setPrice(5000);
        product.setStockAmount(3);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getCode());
    }
}
