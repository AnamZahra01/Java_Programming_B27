package day37_static;

public class BestBuyObject {
    public static void main(String[] args) {
        BestBuy obj1 = new BestBuy();
        obj1.location = "FairFax"; //obj.instanceVariable
        System.out.println(obj1.location);

        System.out.println(BestBuy.headquarters);
        System.out.println(obj1.headquarters);//valid syntax,but no need to use obj t access static variable.
        //Static variables/ methods are accessed by Class name -> Valid conceptually

        //other Static members
        System.out.println(Math.PI);

        /*Q: Why is Main method static?
        so we can call it without needing to make an object.
        so we can call static variables too
         */


    }
}
