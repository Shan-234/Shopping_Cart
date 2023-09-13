import java.util.*;
import java.lang.*;

public class Cart {
    private ArrayList<Item> cart;

    public Cart() {
        cart = new ArrayList<Item>();
    }

    public void AddItem(Item i) {
        cart.add(i);
    }

    public boolean ItemExists(String name) {
        for (Item i : cart) {
            if (name == i.GetName()) {
                return(true);
            }
        }
        return(false);
    }

    public boolean RemoveItem(String name) {
        for (int i = 0; i < cart.size(); i++) {
            if (name == cart.get(i).GetName()) {
                cart.remove(i);
                return(true);
            }
        }
        return(false);
    }

    public boolean UpdateName(String original_name, String new_name) {
        for (Item i : cart) {
            if (original_name == i.GetName()) {
                i.ChangeName(new_name);
                return(true);
            }
        }
        return(false);
    }

    public boolean UpdateQuantity(String original_name, int new_quantity) {
        for (Item i : cart) {
            if (original_name == i.GetName()) {
                i.ChangeQuantity(new_quantity);
                return(true);
            }
        }
        return(false);
    }

    public void ShowItems() {
        System.out.println("Items In Your Cart:");
        System.out.println();
        for (int i = 0; i < cart.size(); i++) {
            System.out.println((i + 1) + "a. Item Name: " + cart.get(i).GetName());
            System.out.println((i + 1) + "b. Item Quantity: " + cart.get(i).GetQuantity());
            System.out.println();
        }
    }
}