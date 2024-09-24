import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void addItem(String name, int quantity, String type) {
        items.add(new Fruit(name, quantity, type));
    }

    public void displayInventory() {
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }
}
