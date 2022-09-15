package day43_abstraction.shoppingPQ1;

public class Runner {
    public static void main(String[] args) {
        Target obj1 = new Target();
        obj1.buyItem();
        obj1.returnItem();
        System.out.println();

        Amazon obj2 = new Amazon();
        obj2.buyItem();
        obj2.hasPaidForShipping(false);
        obj2.returnItem();
        obj2.viewCart();
        System.out.println();

        Ebay obj3 = new Ebay();
        obj3.viewCart();
        obj3.buyItem();
        obj3.hasPaidForShipping(true);
        obj3.uploadProduct();
        obj3.returnItem();
    }
}
