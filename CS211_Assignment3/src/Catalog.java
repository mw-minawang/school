import java.util.ArrayList;

public class Catalog {
    public static final int MAX_ITEMS = 100;
//    private Item[] items;
    private int numItems;

    ArrayList<String> list = new ArrayList<String>();
    ArrayList<Item> items = new ArrayList<Item>();

    //Constructor that takes the name of cs_gift_catalog as String parameter
    public Catalog(String cs_gift_catalog) {
    }


    //add(item) which adds an item at the end of this list
    public void add(Item item) {
        items.add(item);
    }
    //Returns the number of items in this list size of catalog
    public int size() {
        return items.size();
    }
    //Returns the Item with the given Index (0-based)
    public String get()
    {
        String index = list.get(1);
        return index;
    }
    //Returns the name of this catalog
    public String getName(){
        System.out.println("CS Gift Catalog");
        return "CS Gift Catalog";
    }
    //    public Catalog(ArrayList<Catalog> ar){
//        item_list=ar;
//    }
//    public void add(Item add_item) {
//        items[numItems] = add_item;
//        numItems++;
//
//    }

    public Item get(int i) {
        return items.get(i);
    }




}


