package day40_inheritance.rule;

public class C extends A{
    @Override // we are able to change the access modifier to more accessible if we want, in this example public or protected
    public String getName(){ // default access
        return "James";
    }
}
