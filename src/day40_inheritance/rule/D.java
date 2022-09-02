package day40_inheritance.rule;
public class D extends A{
    @Override // you can keep the return type the same, or change to covariant: sub class of that return type
    public D get(){
        return null;
    }
}
