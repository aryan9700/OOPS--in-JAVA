package AbstractDemo;

public abstract class Parent {
    static int age;
    final int VALUE;
    public Parent (int age){
        this.age=age;
        VALUE=33234;//use super keyword to initiate it in child classes
    }
    static void hello(){
        System.out.println("hey");
    }
    void normal(){
        System.out.println("this is a normal method");
    }
    abstract void career ();
    abstract void partner();
}
