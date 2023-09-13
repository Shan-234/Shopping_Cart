public class Item {
    private String name = "";
    private int quantity;

    public Item(String n, int q) {
        name = n;
        quantity = q;
    }

    public String GetName() {
        return(name);
    }

    public void ChangeName(String new_name) {
        name = new_name;
    }

    public int GetQuantity() {
        return(quantity);
    }

    public void ChangeQuantity(int new_quantity) {
        quantity = new_quantity;
    }
}