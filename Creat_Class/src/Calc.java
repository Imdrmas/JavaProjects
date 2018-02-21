/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drmas
 */
public class Calc {
    double number1;
    double number2;
    double result;
    
    public Calc(){
        System.out.println("** New From Calc **");
    }
    public Calc(double number_1, double number_2){
       System.out.println("** New From Calc **");
        number1 = number_1;
        number2 = number_2;
    }
    public double Add(){
        result = number1 + number2;
        return result;
    }
    public double Sub(){
        result = number1 - number2;
        return result;                
    }
    public double Multi(){
        result = number1 * number2;
        return result;
    }
    public double Div(){
        if (number2 == 0) number2 = 1;
        result = number1 / number2;
        return result;
    }
}
