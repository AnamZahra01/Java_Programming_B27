package day43_abstraction.shoppingPQ1;
/*
Create a concrete final class Ebay - Inherit OnlineShopping and implements interface AllowUsersToSell interface - Implement all abstract methods
 */
public final class Ebay extends OnlineShopping implements AllowUsersToSell{
    @Override
    public void uploadProduct() {
        System.out.println("Product is uploading on Ebay");
    }

    @Override
    public void viewCart() {
        System.out.println("Viewing Ebay cart");

    }

    @Override
    public void hasPaidForShipping(boolean value) {
        System.out.println("Paid Shipping Fee to Ebay? " + value);
    }

    @Override
    public void buyItem() {
        System.out.println("Buying Item from Ebay");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning Item to Ebay");
    }
}
