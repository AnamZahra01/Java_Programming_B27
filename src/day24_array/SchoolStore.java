package day24_array;

public class SchoolStore {
    public static void main(String[] args) {

        String[] items = {"Backpack", "Jacket", "Shirt", "Macbook", "Notebook", "Headphones"};
        double[] prices = {59.99, 150.0, 10.55, 1000, 3.49, 15.99};
        int[] itemId = {500101, 500102, 500103, 500104, 500105, 500106};

        //Print catalog

        System.out.println("Full Catalog\nID\t\t|\tName\t\t|\tPrice");
        for(int i = 0; i < items.length; i++){
            System.out.println(itemId[i] + "\t|\t" + prices[i] + "\t\t|\t" + items[i]);
        }

        System.out.println();
        //finding if jackets in the store
        boolean inStock = false;
        for(String eachItem : items){
            if(eachItem.equalsIgnoreCase("jacket")){
                inStock = true;
                break;
            }
        }
        System.out.println(inStock ? "Jacket is in Stock" : "We don't have Jackets");

        //find index of notebook
        int index =  -1;
        for(int i = 0; i < items.length; i++){
            if(items[i].equalsIgnoreCase("notebook")){
            index =  i;
            }
        }
        System.out.println("Index of notebook" + index);

        //Find the information for most expensive item
        System.out.println();
        double maxPrice = prices[0]; //first element is good default
        int indexOfMax = 0;
        for(int i = 1; i < prices.length; i++){

            if(prices[i] > prices[0]){
                maxPrice = prices[i];
                indexOfMax = i;
            }
        }
        System.out.println("Most Expensive Item " +"\t|\t" + itemId[indexOfMax] + "\t|\t" + items[indexOfMax] + "\t|\t"+ maxPrice);

    }
}
 /*
 ALGO:
 Find max price -> find index too
 use index to find the name of item
 use index to find itemID


  */