public class Item {
    public String productName;
    private double singlePrice;
    private int quantity;
    private double bulkPrice;
    private int bulkQuantity;

    //Constructor that takes product name and price as arguments
    public Item(String theProductName, double theProductPrice) {
        if (theProductPrice < 0) {
            throw new IllegalArgumentException("theProductPrice cannot be <0!");
        }
        productName = theProductName;
        singlePrice = theProductPrice;
    }

    //Constructor that takes product name, price, bulk quantity, and bulk price as arguments.
    public Item(String theProductName, double theProductPrice, int theBulkQuantity, double theBulkPrice) {
        this(theProductName, theProductPrice);
        if (theBulkQuantity < 0) {
            throw new IllegalArgumentException("theBulkQuantity can't be < 0");
        }
        bulkQuantity = theBulkQuantity;
        bulkPrice = theBulkPrice;
    }
}



//        //Return the price given the quantity number
//        public double pricefor ( int quantity){
//            pricefor = singlePrice * quantity;
//        }


//    public String toString() {
//        //if regular single price
//        return (productName + ", " + singlePrice );
//        //else (bulk quantity and price)
//        //return (productName + "  " + "(" + bulkQuantity + " for" + bulkPrice);
//    }
//
//}

//
//

//        public double priceFor(int theQuantity){
//            double itemTotal = 0;
//
//            //first check the item is a bulk item
//            if ((bulkQuantity != 0)) {
//
//                //check if the bulk item but the quantity less then bulk special
//                if (theQuantity < bulkQuantity) {
//                    itemTotal = singlePrice * theQuantity;
//
//                } else {
//                    final int extras = theQuantity % bulkQuantity;
//                    final int numbOfBulks = (int) (theQuantity / bulkQuantity);
//                }
//            }
//            itemTotal = singlePrice * theQuantity;
//
//            return itemTotal;
//        }
//    }
