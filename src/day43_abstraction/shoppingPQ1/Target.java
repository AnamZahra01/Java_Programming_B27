package day43_abstraction.shoppingPQ1;
/*
Create a concrete final class Target - Inherit Shopping and implement all abstract methods
 */
public final class Target extends Shopping {
    @Override
    public void buyItem() {
        System.out.println("Buying Item");
    }
    @Override
    public void returnItem() {
        System.out.println("Returning Item");
    }
}
