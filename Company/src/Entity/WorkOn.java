
package Entity;

import company.Tools;
import javax.swing.JTable;

public class WorkOn implements mainData{
    private int EmpNo;
    private int ProjectNo;

    public int getEmpNo() {
        return EmpNo;
    }

    public void setEmpNo(int EmpNo) {
        this.EmpNo = EmpNo;
    }

    public int getProjectNo() {
        return ProjectNo;
    }

    public void setProjectNo(int ProjectNo) {
        this.ProjectNo = ProjectNo;
    }

    @Override
    public void add() {
       String strInsert = "insert into workon values("
               + EmpNo + ","
               + ProjectNo + ")";
       boolean isAdd = db.go.runNonQuery(strInsert);
       if(isAdd){
           Tools.msgBox("Work on is added");
       }
    }

    @Override
    public void update() {
      Tools.msgBox("Update Method Not Working In Workon Class");
    }

    @Override
    public void delete() {
          String strDelete = "delete from workon where "
          + "EmpNo=" + EmpNo
          + " and "
          + "ProjectNo=" + ProjectNo;        
        boolean isDelete =  db.go.runNonQuery(strDelete);
       if(isDelete){
           Tools.msgBox("Work on is deleted");
       }   
    }

    @Override
    public void getAllRows(JTable table) {
         db.go.fillToJTable("workno_data", table);
    }

    @Override
    public void getOneRow(JTable table) {
         String strSelect = "select * from workno_data where "
                 + "Employee_No=" + EmpNo
                 + " and "
                 + "Project_No=" + ProjectNo;
         db.go.fillToJTable(strSelect, table);
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
               db.go.fillToJTable(statement, table);
    }

    @Override
    public String getAutoNumber() {
         Tools.msgBox("getAutoNumber Method Not Working In Workon Class");
         return "";
    }

    @Override
    public String getValueByName(String name) {
    Tools.msgBox("getValueByName Method Not Working In Workon Class");
         return "";
    }

    @Override
    public String getNameByValue(String value) {
     Tools.msgBox("getNameByValue Method Not Working In Workon Class");
         return "";
    }
    
}
