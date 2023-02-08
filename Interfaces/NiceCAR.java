package Interfaces;

public class NiceCAR {
    private Engine engine;
    private Media player=new CDPlayer();
    public NiceCAR(){
        engine =new PowerEngine();
    }
    public NiceCAR(Engine engine){
        this.engine=engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
            }
     public void accel(){
        engine.accel();
            }     
    public void startMusic(){
        player.start();
    } 
    public void stopMusic(){
        player.stop();
    }   
    public void upgradeEngine(){
this.engine=new ElectricEngine();
    }    
                
}
