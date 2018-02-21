/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author drmas
 */
public class Inheritance {
   /* 
    public enum Floor{
        F1, F2, F3, F4, F5;
        
        private Floor(){
            System.out.println("Enum Fllor");
        }
    }
    
    static void GetType(Person p){
        p.GetPersonType();
    }
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /* Phone p = new Phone("issam");
       Nokia1 n = new Nokia1();
       Nokia2 n2 = new Nokia2();
       Lg lg = new Lg(); */
      
      /*
      Person ps = new Person("drmas");
      Custemer cu = new Custemer("Issam");
      Student st = new Student("Kaled");
      Employee em = new Employee("Amany");
      Doctor Do = new Doctor("Kaother");
      */
      /*
      System.out.println(ps.Name);
      System.out.println(cu.Name);
      System.out.println(st.Name);
      System.out.println(em.Name);
      System.out.println(Do.Name); */
      
     // Floor f = Floor.F3;
      /*
      em.WorkFloor = Floor.F1;
      Do.WorkFloor = Floor.F2;
      System.out.print(Do.WorkFloor +"\n");
      
      GetType(ps);
      GetType(cu);
      GetType(st);
      GetType(em);
      GetType(Do);
     */
      /*
      EmpEnum e = new EmpEnum(Floor.F1, FloorType.out);
       EmpEnum e2 = new EmpEnum(Floor.F2, FloorType.in);
      e.EmpNo = 1;
      e.EmpName = "drmas";
      e.Address = "Paris";


      System.out.println(e.getWorkFloor().getNum());
      System.out.println(e.getWorkFloor().getName());
      System.out.println(e.type);
      
      System.out.println(e2.getWorkFloor().getNum());
      System.out.println(e2.getWorkFloor().getName());
      System.out.println(e2.type);
      */
     
      
      System.out.println(Floor.of(1));
       System.out.println(Floor.of(2));
        System.out.println(Floor.of(5));
      
    }   
}
