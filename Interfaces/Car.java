package Interfaces;

public class Car implements Engine, Brake, Media  {

    @Override
    public void brake() {
       System.out.println(" I brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println(" I engine start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println(" I engine stop like a normal car");
    }

    @Override
    public void accel() {
        System.out.println(" I accel like a normal car");
    }
}