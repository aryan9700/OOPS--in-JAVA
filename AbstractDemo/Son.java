package AbstractDemo;

public class Son extends Parent {
    public Son(int age){
        super(age);
        Son.age=age;
    }

    @Override
    void career() {
      System.out.println(" I am going to be a doctor");
    }

    @Override
    void partner() {
       System.out.println("I love wanderlust");
    }
    @Override
    void normal(){
        super.normal();
    }
    
}
