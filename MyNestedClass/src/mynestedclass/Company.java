
package mynestedclass;

public class Company {
    public String companyName;
    
       class Building{
        public String BuidingName;
        class Floor {
            String FloorName;
            class Room{
                String RoomName;
            }
        }
       
    }
       
       class Lap{
           public String EmpName;
           public void Test(){
              Company.this.companyName = "";
              Company.Department.DepartmentName = "";
           }
       }
   
   static class Department{
    public static String DepartmentName;
    
}
}
