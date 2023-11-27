import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<CartItem> items;
    private int quantity;

    public ShoppingCart() {
        this.items = new ArrayList<>();
        this.quantity = 0;
    }

    public void addItem(CartItem item) {
        items.add(item);
        quantity += item.getQuantity();
    }

    public void removeItem(String productName) {
        for (CartItem item : items) {
            if (item.getProduct().getProductName().equalsIgnoreCase(productName)) {
                quantity -= item.getQuantity();
                items.remove(item);
                break;
            }
        }
    }

    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("O carrinho está vazio.");
        } else {
            System.out.println("Produtos no carrinho:");
            for (CartItem item : items) {
                Product product = item.getProduct();
                System.out.println("Nome: " + product.getProductName() +
                                   ", Preço: " + product.getPrice() +
                                   ", Quantidade: " + item.getQuantity());
            }
            System.out.println("Quantidade total de itens no carrinho: " + quantity);
        }
    }
}
