package Introduction;

public class WrapperExample {
    public static void main(String[] args) {
        // int a=10;
        // int b=24;
        Integer a =40;
        Integer b=60;
        Integer num =45;//num object created
        num.toString();
        System.out.println(num);
        swap(a,b);
        System.out.println(a+" "+b);//no swap occur because there is no such thing as pass by reference in java
        //everything is pass by value
    //    final int bonus =2;//final keyword is like constant 
    //     bonus=3; // XXXX
    //final variables have to be initialised always intizialise it because it cannot change after declaring
    final A kunal=new A("Kunal kushwaha");
    kunal.name="harrish rauf";

    //When a not primitive is final you cannot reassign it.
    // kunal=new A("harrish raufff");//not valid as final violate

  A obj;
  for (int i = 0; i < 1000000000; i++) {
    obj=new A("hawk");
  }


    }

    // private static void swap(int a, int b) {
    //     int temp=a;
    //     a=b;
    //     b=temp;
    // }
    private static void swap(Integer a, Integer b) {//this also not working because Integer has Final class
        int temp=a;
        a=b;
        b=temp;
    }
}
class A{
    final int num =10;
    String name;

    public A(String name){
       // System.out.println("oBject is being created");
        this.name=name;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
