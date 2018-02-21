
package mynestedclass;

public class MyClass<MyType> {
    public MyType mytype;
    
    public void PrintType(){
        System.out.println(mytype.getClass().getName());
    }
    
}
