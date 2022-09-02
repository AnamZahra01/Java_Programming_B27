package day38_encapsulation.extra_practice;
/*create a class called Square
        - data:  side

        - constructor - create a constructor that creates a Square object with the side

            	call setter here

        - encapsulate the Square class

        	- setter condition: side must be a positive number otherwise it will not be assigned to the instance variable

        - other methods methods:

            - calculateArea()
  				calculate and return the area of a Square

            - calculatePerimeter()
  				calculate and return the perimeter of a Square

            - toString()
                print the side, area, and perimeter of the Square object

    Create a separate class to create and test the Square objects

 */
public class Square {
    //encap -> data hiding
    //encap -> constructor -> setmethod (if, else)-> initialize ins.var
    private double side; //ins var
    //cons
    public  Square (double side){
        setSide(side); //calling setter
    } //cons ends
    //setter meth
    public void setSide(double side){ //void -> print or no return
        if(side > 0) {
            this.side = side;
        }}

    public double getSide() { //return
        return side;
    }

    public double calcArea(){ //-> in arg use  this.side
        return this.side * this.side;
    }
    public double calcPeri(){
        return 4 * side;
    }

    public String toString() {
        return "Square{" +
                "side=" + side + ", Area: " + calcArea() + " , Perimeter: " + calcPeri()+
                '}';
    }
}
