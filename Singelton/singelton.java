package Singelton;

public class singelton {
    public static void main(String[] args) {
    
}
    private singelton(){

    }
    private static singelton instance;

    public static singelton getInstance(){
        //check whether one object is created or not
        if(instance==null){
            instance=new singelton();
        }
        return instance;
    }}
