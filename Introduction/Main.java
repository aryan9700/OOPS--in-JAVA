package Introduction;

public class Main{
    public static void main(String[] args) {
        //Store 5 roll no.
        int[] numbers =new int[5];
        //Store 5 names
        String[] names = new String[5];
        //Data of 5 students: { rollno, name, marks}
        int[] rollno = new int[5];
        String[] name= new String[5];
        float[] marks =new float[5];
        
        //Create your own Datatype using classes
        Student[] students=new Student[5];

        Student kunal = new Student(24, "kunal kushwahaye", 89.5f, true);//new keyword give dynamic merory alloaction
        Student Random =new Student(kunal);
        System.out.println();
        System.out.println(Random.rollno);

        Student Random2=new Student();
       System.out.println(Random2.name);
        //initializing variables using (.) dot operator
        // kunal.rollno=24;
        // kunal.name="kunal kushwaha";
        // kunal.marks=89.5f;
        // kunal.pass=true;
//         kunal.changeName("Aryan yadav");
// kunal.greeting();

        //checking default values for datatypes in java
        System.out.println(kunal.rollno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);
        System.out.println(kunal.pass);

}
}
//create a class for every single Students
class Student{
    int rollno;
    String name;
    float marks;
    boolean pass;
    //we need a way to add the values of the above
    //properties object by object

    void greeting(){
        System.out.println("hello! my name is "+name);
    }
    void changeName(String newName){
         name=newName;
    }
    Student(Student other ){
        this.rollno=other.rollno;
       this.name=other.name;
        marks=other.marks;
        pass=other.pass;

    }
    //we need one word to access every object=this keyword
    Student(){
    //  this.rollno=34;
    //  this.name="kunal kushwaha";
    //  this.marks=89.5f;
    //  this.pass=false;
    //This is how you call Constructor using another constructor
    //Internally it is something like : new Student(24,"rahul raj",85.4f,true);
    this(24,"rahul raj",85.4f,true);
    }
    Student(int roll ,String name , float marking, boolean passing ){
        this.rollno=roll;
       this.name=name;
        marks=marking;
        pass=passing;

    }

}

