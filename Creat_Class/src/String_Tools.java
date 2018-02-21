/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drmas
 */
public class String_Tools {
    String text;
    private String inverseText;
    String texts[];
    String textArray;
    
    public String_Tools(String text){
        this.text = text;
    }
    public String_Tools(String texts[]){
        this.texts = texts;
        textArray = "";
    }
    public void printCharByChar(){
        for(char c : text.toCharArray()){
            System.out.println(c);
        }     
    } 
    
       public void printCharByCharInverse(){
         StringBuilder sb = new StringBuilder(text);
         inverseText = sb.reverse().toString();
         for(char c : inverseText.toCharArray()){
             System.out.println(c);
         }
     }   
    
       public void printStringArry(){
           for(String s : texts){
               System.out.println(s);
           }
       }
       public String getStringArryElement(){
           for(String s : texts){
               textArray += s + "; ";
           }
           return textArray;
       }
    
} //endding
