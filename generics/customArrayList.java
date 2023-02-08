package generics;

import java.util.ArrayList;

public class customArrayList {
    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size =0;//also working as index value

    public customArrayList(){
        this.data=new int [DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data [size++]=num;
    }
    private void resize() {
        int[] temp = new int[data.length*2];
  //copy the cuurent item in the new array
  for (int i = 0; i < data.length; i++) {
    temp[i]=data[i];
    data=temp;
  }
    }
    private boolean isFull() {
        return size==data.length;
    }
    public int remove(){
        int removed=data[--size];
        return removed;
    }
    public static void main(String[] args) {
        ArrayList list =new ArrayList();
       
        
    }
}
