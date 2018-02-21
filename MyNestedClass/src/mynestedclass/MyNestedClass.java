
package mynestedclass;
public class MyNestedClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Company com = new Company();
        Company.Department dept = new Company.Department();
        Company.Building buid = com.new Building(); */
      /* 
       MyClass<String> c1 = new MyClass<String>();
       c1.mytype = "drmas";
       MyClass<Integer> c2 = new MyClass<Integer>();
       c2.mytype = 11;
       MyClass<Boolean> c3 = new MyClass<Boolean>();
       c3.mytype = true;
       
       c1.PrintType();
       c2.PrintType();
       c3.PrintType();
       */
      /*
      MyClass2<Double, String, Integer> myc = new MyClass2<Double, String, Integer>();
      myc.t1 = 4323.32;
      myc.t2 = "drmas";
      myc.t3 = 122;
      myc.PtinyTypes();
      */
      
      
      Hello1 h1 = new Hello1();
      Hello2 h2 = new Hello2();
     // h1.run();
     // h2.run();
     new Thread(h1).start();
     new Thread(h2).start();
      
    } //endding
    
}
