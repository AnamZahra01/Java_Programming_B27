package day22_array.adams_only;

public class Task4 {
    /*
    Assume that you searched a baby toy in Etsy.When you open related category your url is :
			    			"https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049"
			    									(main category)
						 According to this result print out main category name
						 Input :  https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049
						 Output:
						 			Main Category name is  toys and games
						 Input :  https://www.etsy.com/c/toys-and-entertainment?ref=catnav-11049
						 								     (main category)
						 Output:
						 			Main Category name is  toys and entertainment
     */
    public static void main(String[] args) {
        String str = "https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049";

        String firstIndex = str.substring(str.indexOf("c/")+2);
        String mainCategory = firstIndex.substring(0,firstIndex.indexOf("/"));

        System.out.println(mainCategory.replace("-"," "));

    }
}
