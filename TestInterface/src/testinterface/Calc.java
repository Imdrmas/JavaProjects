
package testinterface;

public class Calc implements Calc1{

    @Override
    public int Add(int num1, int num2) {
        return num1 + num2;
    }
   

    @Override
    public int Mult(int num1, int num2) {
         return num1 * num2;
    }

    @Override
    public int Div(int num1, int num2) {
         return num1 / num2;
    }

    @Override
    public int Mod(int num1, int num2) {
        return num1 % num2;
    }

    @Override
    public int Sub(int num1, int num2) {
        return num1 * num2;
    }
    
}
