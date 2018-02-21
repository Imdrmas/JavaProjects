
package abeclasstest;

public abstract class Com {
    
    public String RamInfo;
    public final String Name = "Basic Computer";
    
    public void Stop(){
        System.out.println("Computer Stop");
    }
    
   abstract public void Run();
   abstract public void Run(String ComputerName);
}
