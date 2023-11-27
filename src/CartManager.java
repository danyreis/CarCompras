import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CartManager {
    private Scanner scanner;
    //private List<CartItem> cartItems;
    private ShoppingCart shoppingCart;

    public CartManager() {
        this.scanner = new Scanner(System.in);
        //this.cartItems = new ArrayList<>();
        this.shoppingCart = new ShoppingCart();
    }

    public void addProduct() {
        System.out.println("Informe o nome do produto:");
        String name = scanner.next();

        System.out.println("Informe o preço do produto:");
        double price = scanner.nextDouble();

        Product product = new Product(name, price);
        System.out.println("Informe a quantidade do produto:");
        int quantity = scanner.nextInt();
        CartItem cartItem = new CartItem(product, quantity);
        //cartItems.add(cartItem);
        shoppingCart.addItem(cartItem);

        System.out.println("É um produto com desconto? (s/n)");
        String isDiscounted = scanner.next();

        /*DiscountedProduct product;

        if ("s".equalsIgnoreCase(isDiscounted)) {
            System.out.println("Informe o desconto (ex., 0,20 para 20%):");
            double discountRate = scanner.nextDouble();
            product = new DiscountedProduct(name, price, discountRate);
        } else {
            product = new Product(name, price);
        }*/

    }

    public void removeProduct() {
        System.out.println("Informe o nome do produto para remover:");
        String productName = scanner.next();
        shoppingCart.removeItem(productName);
    }

    public void displayCart() {
        shoppingCart.displayCart();
        /*if (cartItems.isEmpty()) {
            System.out.println("O carrinho está vazio.");
        } else {
            System.out.println("Produtos no carrinho:");
            for (CartItem cartItem : cartItems) {
                Product product = cartItem.getProduct();
                System.out.println("Nome: " + product.getProductName() +
                        ", Preço: " + product.getPrice() +
                        ", Quantidade: " + cartItem.getQuantity());
            }
        }*/
    }
}