public class ItemOrder {
    private Item myItem;
    private int myQuantity;

    public ItemOrder(Item orderItem, int orderQuantity) {
        if (orderQuantity < 0) {
            throw new IllegalArgumentException("theQuantity can't be < 0");
        }
        myItem = orderItem;
        myQuantity = orderQuantity;
    }
}

//    public float calculateOrderTotal() {
//        return myItem.priceFor(myQuantity);
//    }
//
//}
