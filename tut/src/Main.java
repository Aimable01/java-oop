public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Item item = new Item("Generic item",10);
        Fruit fruit = new Fruit("Apple",20,"Fuji");

        inventory.addItem(item);
        inventory.addItem(fruit);

        inventory.displayInventory();
    }
}