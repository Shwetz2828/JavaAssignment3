package tnsif.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Products {
    private ArrayList<String> productList;

    public Products() {
        this.productList = new ArrayList<>();
    }

    public ArrayList<String> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<String> productList) {
        this.productList = productList;
    }

    public void addProductToList(String product) {
        productList.add(product);
    }

    public void sortProductList() {
        Collections.sort(productList);
    }
}

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Products products = new Products();

        int choice;
        do {
            System.out.println("1.Add\n2.Display\n3.Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter the product");
                    String product = scanner.nextLine();
                    products.addProductToList(product);
                    break;
                case 2:
                    ArrayList<String> productList = products.getProductList();
                    if (productList.isEmpty()) {
                        System.out.println("The list is empty");
                    } else {
                        products.sortProductList();
                        for (String item : productList) {
                            System.out.println(item);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using the application");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
