
public class Main{
    public static void main(String[] args) {
        //indirectly extending object class in java
        A obj = new A(10,"aryan");
        //need to do a few thing
        //1.Access the data members.
        //2.Modify the data members.
       
        // ArrayList<Integer> list= new ArrayList<>(20);
        // list.DEFAULT_CAPACITY;
        obj.getNum();

        //imp:only the subclass in different package can access num not even that class for Protected
        //child ko allowed hai parents ko nhi
        //either be subclass of A or subclass of itself then can access.
    }
}