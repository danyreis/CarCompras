public class Product {

    //Variáveis de instância
    private String productName;
    private double price;
    private int productId;

    //método construtor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        
    }
    //métodos Get e Set
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName){
        this.productName=productName;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public int getProductId(){
        return productId;
    }

    public void setProductId(int product){
        this.productId=productId;
    }

}