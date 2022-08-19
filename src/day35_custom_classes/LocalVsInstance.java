package day35_custom_classes;

public class LocalVsInstance {
    //a,b -> instance variables. means they belong to object
    int a = 5;
    int b = 10;

    public LocalVsInstance(int a, int z){ //a,z parameters of constructor or method -> local variables
        a = a;
        b = z;
    }

    public void print(){
        System.out.println(a);
    }

    public static void main(String[] args) {
        LocalVsInstance obj = new LocalVsInstance(20,50);
        System.out.println(obj.a);
    }

}
