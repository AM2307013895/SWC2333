/* 
    File name   : FlowerShop.java
    Programmer  : Hakim Musyamril
    ID          : AM2307013895
    Subject     : SWC2333
    Date        : 19 February 2024
*/

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Flower[] inventory = new Flower[10];

        // Input data for each flower
        for (int i = 0; i < inventory.length; i++) {
            System.out.println("Enter details for flower " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Color: ");
            String color = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            inventory[i] = new Flower(name, color, price, quantity);
        }

        // Display all flower details
        System.out.println("\nFlower Inventory:");
        for (Flower flower : inventory) {
            System.out.println(flower);
        }

        // Calculate and display total value of flower inventory
        double totalValue = 0;
        for (Flower flower : inventory) {
            totalValue += flower.getPrice() * flower.getQuantity();
        }
        System.out.println("\nTotal Value of Inventory: RM" + totalValue);

        // Search for a flower by name
        System.out.print("\nEnter the name of the flower to search: ");
        String searchName = scanner.nextLine();
        boolean found = false;
        for (Flower flower : inventory) {
            if (flower.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Flower found:\n" + flower);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Flower not found.");
        }

        // Restock a specific flower
        System.out.print("\nEnter the name of the flower to restock: ");
        String restockName = scanner.nextLine();
        System.out.print("Enter the quantity to add: ");
        int restockQuantity = scanner.nextInt();
        for (Flower flower : inventory) {
            if (flower.getName().equalsIgnoreCase(restockName)) {
                flower.setQuantity(flower.getQuantity() + restockQuantity);
                System.out.println("Restocked " + restockQuantity + " " + restockName);
                break;
            }
        }

        scanner.close();
    }
}