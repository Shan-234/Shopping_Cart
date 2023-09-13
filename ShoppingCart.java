import java.util.*;
import java.lang.*;
import java.io.*;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cart cart = new Cart();

        System.out.println("SHOPPING CART:");
        System.out.println();
        System.out.println();

        while (true) {
            System.out.println("A - Add Item");
            System.out.println("R - Remove Item");
            System.out.println("U - Update Item");
            System.out.println("V - View Cart");
            System.out.println("E - Exit");
            System.out.print("Enter Option: ");
            String option = input.nextLine();

            String item_name;
            int item_quantity;
            if (option.equals("A")) {
                System.out.print("Enter Item Name: ");
                item_name = input.nextLine();
                System.out.print("Enter Item Quantity: ");
                item_quantity = input.nextInt();
                cart.AddItem(new Item(item_name, item_quantity));
            } else if (option.equals("R")) {
                System.out.print("Enter Name of Item to Remove: ");
                item_name = input.nextLine();
                if (cart.RemoveItem(item_name)) {
                    System.out.println(item_name + " Was Removed From Your Cart.");
                } else {
                    System.out.println(item_name + " Is Not In Your Cart.");
                }
            } else if (option.equals("U")) {
                System.out.println("I - Change Item");
                System.out.println("Q - Change Item Quantity");
                System.out.print("Enter Option: ");
                option = input.nextLine();
                if (option.equals("I")) {
                    System.out.print("Enter Name of Item To Be Changed: ");
                    item_name = input.nextLine();
                    System.out.print("Enter Name of New Item: ");
                    String new_item = input.nextLine();
                    System.out.print("Enter Quantity of New Item: ");
                    item_quantity = input.nextInt();
                    if (cart.UpdateName(item_name, new_item)) {
                        cart.UpdateQuantity(new_item, item_quantity);
                        System.out.println(item_name + "Was Changed To " + new_item + ".");
                    } else {
                        System.out.println(item_name + "Could Not Be Found In Your Cart.");
                    }
                } else if (option.equals("Q")) {
                    System.out.print("Enter Name of Item: ");
                    item_name = input.nextLine();
                    System.out.print("Enter New Quantity: ");
                    item_quantity = input.nextInt();
                    if (cart.UpdateQuantity(item_name, item_quantity)) {
                        System.out.println("The Quantity of " + item_name + " Was Changed To " + item_quantity + ".");
                    } else {
                        System.out.println(item_name + "Could Not Be Found In Your Cart");
                    }
                }
            } else if (option.equals("V")) {
                cart.ShowItems();
            } else if (option.equals("E")) {
                break;
            }
        }
        input.close();
    }
}