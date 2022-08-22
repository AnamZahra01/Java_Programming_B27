package day39_inheritance.people;

public class Employee extends Person{

//    public  Employee(){
//        super(); //calls parent constructor with no args
//     //Sol 1: make constructor with no arg -> not preferred
//
//    }

    double salary;

    public Employee(String name, int age, double salary){
        super(name, age); //calling from parent
        //we don't inherit constructors, we call them -> super constructors
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    //overloaded constructor

}
/*
this() v/s super:
super is calling the parent class constructor and this. is calling the employee instance var
 */
