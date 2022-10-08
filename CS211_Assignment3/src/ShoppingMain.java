/**
 *
 * @author Reges and Stepp, Building Java Programs
 * modified for Bellevue College
 * for CS211 class
 *
 */
// ShoppingMain provides method main for a simple shopping program.

public class ShoppingMain {
    public static void main(String[] args) {
        Catalog catalog = new Catalog("CS Gift Catalog");
        catalog.add(new Item("silly putty", 3.95, 10, 19.99));
        catalog.add(new Item("silly string", 3.50, 10, 14.95));
        catalog.add(new Item("bottle o bubbles", 0.99));
        catalog.add(new Item("Nintendo Wii system", 389.99));
        catalog.add(new Item("Don Knuth Code Jam Challenge (Wii)", 49.99));
        catalog.add(new Item("Computer Science pen", 3.40));
        catalog.add(new Item("Rubik's cube", 9.10));
        catalog.add(new Item("Computer Science Barbie", 19.99));
        catalog.add(new Item("'Java Rules!' button", 0.99, 10, 5.0));
        catalog.add(new Item("'Java Rules!' bumper sticker", 0.99, 20, 8.95));

        ShoppingFrame f = new ShoppingFrame(catalog);
        f.setVisible(true);

    }
}