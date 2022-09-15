package day43_abstraction.shoppingPQ1;
/*
Create a concrete final class Amazon - Inherit OnlineShopping and implement all abstract methods
 */
public final class Amazon extends OnlineShopping{
    @Override
    public void viewCart() {
        System.out.println("Viewing Amazon cart");
    }

    @Override
    public void hasPaidForShipping(boolean value) {
        System.out.println("Paid Shipping Fee to Amazon? " + value);
    }

    @Override
    public void buyItem() {
        System.out.println("Buying Item from Amazon");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning Item to Amazon");
    }
}
