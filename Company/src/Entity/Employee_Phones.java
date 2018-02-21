
package Entity;

import company.Tools;
import javax.swing.JTable;

public class Employee_Phones implements mainData{
    private int EmpNo;
    private String Phone;

    public int getEmpNo() {
        return EmpNo;
    }

    public void setEmpNo(int EmpNo) {
        this.EmpNo = EmpNo;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    @Override
    public void add() {
        String strInsert = "insert into employee_phone values("
                + EmpNo + ","
                + "'" + Phone + "')";
        boolean isAdd = db.go.runNonQuery(strInsert);
        if(isAdd){
          //  Tools.msgBox("Phone Is Added");
        }
    }

    @Override
    public void update() {
        Tools.msgBox("Update Method In Employee_Phones Class Not Working !");
    }

    @Override
    public void delete() {
        String strDelete = "delete from employee_phone "
                + " where "
                + " empno=" + EmpNo
                + " and phone='" + Phone + "'";
        boolean isDelete = db.go.runNonQuery(strDelete);
        if(isDelete){
           // Tools.msgBox("Phone IsDeleted");
        }
    }

    public void deleteByEmp(){
     String strDelete = "delete from employee_phone"
             + " where empNo=" + EmpNo;
     boolean isDelete = db.go.runNonQuery(strDelete);
     if(isDelete){
         //Tools.msgBox("Phones Are Deleted");
     }
    }
    
    @Override
    public void getAllRows(JTable table) {
         String strSelect = "select phone from employee_phone"
                 + " where empNo=" + EmpNo;
         db.go.fillToJTable(strSelect, table);
    }

    @Override
    public void getOneRow(JTable table) {
          String strDelete = "getOneRow from employee_phone ";
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
          String strDelete = "getCustomRows from employee_phone ";
    }

    @Override
    public String getAutoNumber() {
        String strDelete = "getAutoNumber from employee_phone ";
        return "";
    }

    @Override
    public String getValueByName(String name) {
         String strDelete = "getValueByName from employee_phone ";
         return "";
    }

    @Override
    public String getNameByValue(String value) {
         String strDelete = "getNameByValue from employee_phone ";
         return "";
    }
    public String getEmpNoByPhone(String requestPhone){
        String strSelect = "select empno from employee_phone"
                + " where phone='" + requestPhone + "'";
        Object row[][] = db.go.getTableData(strSelect).Items;
        String strEmpNo = "";
        if(row.length > 0){
             strEmpNo = (String)row[0][0];
        }else{
            strEmpNo = "0";    
        }
        return strEmpNo;
    }
}
