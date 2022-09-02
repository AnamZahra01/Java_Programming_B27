package day40_inheritance.rule;

class B extends A {
    @Override //can not change name opr parameters
    public void getNum() {
        System.out.println("sub constructor B");
    }


}
