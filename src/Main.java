import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CartManager cartManager = new CartManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Adicionar produto\n2. Remover produto\n3. Exibir carrinho\n4. Sair");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    cartManager.addProduct();
                    break;
                case 2:
                    cartManager.removeProduct();
                    break;
                case 3:
                    cartManager.displayCart(); // Adicionado este comando
                    //System.out.println("carrinho de compras"); //remover essa linha posteriori 
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}