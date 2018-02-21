
package mynestedclass;

public class Hello1 implements Runnable {
    
     @Override
    public void run(){
        for(int x = 0; x < 20; x++){
            System.out.println("Hello 1");
        }
    }


}
