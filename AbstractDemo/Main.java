package AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();

        Parent daughter = new Daughter(18);
        daughter.career();

        // Parent mom =new Parent(20){
        //     @Override
        //     void career(){

        //     }
        //     @Override
        //     void partner(){

        //     }
        // };//You can't create object of an abstract class
        son.normal();

      
    }
    }

