public class Main {
    public static void main(String[] args) {
        Human kunal=new Human(24, "kunal", 40000, false);
        Human rahul=new Human(44, "rahul", 450000, true);
        Human rohit=new Human(74, "rohit", 44000, false);

        System.out.println(kunal.population);//not a convension but work
        System.out.println(Human.population);//standard convention for static variables
        System.out.println(rohit.population);//without object being created you can use static varibales
        
        Main fun =new Main();
        fun.fun2();
    }
        //this is not depending on object
        static void fun(){
      //  greeting();//inside static you cannot use anything which is not static
        //you cannot use this because it requires an instance
        //but the function you are using it in doesnot depend on instances

         //you cannot access non static stuff without referencing there instances 
        //in a static context
            //Hence here i am referencing it...
        Main obj= new Main();
        obj.greeting();//
    }
    void fun2(){
        greeting();//as everything which is not static are static as they are part of psvm main
    }
//we know that something which is not static belongs to an object.
     void greeting() {
       // fun(); you can use it here as non static are open for all
        System.out.println("hello world");
    }
}
