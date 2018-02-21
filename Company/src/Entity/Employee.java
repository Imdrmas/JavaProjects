
package Entity;

import company.Tools;
import javax.swing.JTable;

public class Employee implements mainData {
    private int EmpNo;
    private String EmpName;
    private String Address;
    private double salary;
    private String HiringDate;
    private String BirthDate;
    private int DeptNo;

    public int getEmpNo() {
        return EmpNo;
    }

    public void setEmpNo(int EmpNo) {
        this.EmpNo = EmpNo;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getHiringDate() {
        return HiringDate;
    }

    public void setHiringDate(String HiringDate) {
        this.HiringDate = HiringDate;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    public int getDeptNo() {
        return DeptNo;
    }

    public void setDeptNo(int DeptNo) {
        this.DeptNo = DeptNo;
    }

    @Override
    public void add() {
      String strInsert = "insert into employee values("
              + EmpNo + ","
              + "'" + EmpName + "',"
              + "'" + Address + "',"
              + salary + ","
              + "'" + HiringDate + "',"
              + "'" + BirthDate + "',"
              + DeptNo + ")";
      boolean isAdd = db.go.runNonQuery(strInsert);
      if(isAdd){
          Tools.msgBox("Employee Is Added");
      }
    }

    @Override
    public void update() {
          String strUpdate = "update employee set "
                  + "EmpName='" + EmpName + "',"
                  + "Address='" + Address + "',"
                  + "Salary=" + salary + ","
                  + "HiringData='" + HiringDate + "',"
                  + "BirthDate='" + BirthDate + "',"
                  + "DeptNo=" + DeptNo 
                  + " where EmpNo=" + EmpNo;
          boolean isUpdate = db.go.runNonQuery(strUpdate);
          if(isUpdate){
              Tools.msgBox("Employee Is Updated");
          }
    }

    @Override
    public void delete() {
         String strDelete = "delete from employee"
                 + " where EmpNo=" + EmpNo;
         boolean isDelete = db.go.runNonQuery(strDelete);
         if(isDelete){
             Tools.msgBox("Employee Is Deleted");
         }
    }

    @Override
    public void getAllRows(JTable table) {
        db.go.fillToJTable("employee_data", table);
    }

    @Override
    public void getOneRow(JTable table) {
       String strSelect = "select * from employee_data"
               + " where NUMBER=" + EmpNo;
       db.go.fillToJTable(strSelect, table);
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
          db.go.fillToJTable(statement, table);
    }

    @Override
    public String getAutoNumber() {
        return db.go.getAutoNumber("Employee", "EmpNo");
    }

    @Override
    public String getValueByName(String name) {
        String strSelect = "select EmpNo from employee"
                + " where EmpName='" + name + "'";
         String strVal = (String)db.go.getTableData(strSelect).Items[0][0];
        return strVal;
    }

    @Override
    public String getNameByValue(String value) {
               String strSelect = "select empName from employee"
                + " where EmpNo=" + value;
        String strName = (String)db.go.getTableData(strSelect).Items[0][0];
        return strName;
    }
    
            
}
