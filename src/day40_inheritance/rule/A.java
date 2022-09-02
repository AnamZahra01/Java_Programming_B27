package day40_inheritance.rule;
class A {
    public void getNum() {
        System.out.println("super constructor");    }
    public String getName(){ // default access
        return "James";
    }
    public A get(){ // A is the return type, the method should return an A object
        return new A(); // A obj = new A();
    }
}