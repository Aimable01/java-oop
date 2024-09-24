public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Item item = new Item("Generic item",10);
        Fruit fruit = new Fruit("Apple",20,"Fuji");
        Weapon weapon = new Weapon("Sword",2,75,"Melon");

        inventory.addItem(item);
        inventory.addItem(fruit);
        inventory.addItem(weapon);

        inventory.displayInventory();
    }
}