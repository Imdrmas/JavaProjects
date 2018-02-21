
package abeclasstest;
public class PC extends Com{
     
    @Override
    public void Run(){
        System.out.println("PC Running...");
    }
    
    @Override
    public void Run(String PcName){
       System.out.println("PC " + PcName + "Run");
    }
    
    @Override 
    public void Stop(){
        System.out.println("Stop");
    }
}
