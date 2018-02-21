
package Entity;

import company.Tools;
import javax.swing.JTable;

public class Project implements mainData{
    private int ProjectNo;
    private String ProjectName;
    private String Location;
    private int DeptNo;



    @Override
    public void add() {
        String strInsert = "insert into project values("
        + ProjectNo + ","
        + "'" + ProjectName + "',"
        + "'" + Location + "',"
        + DeptNo + ")";
     boolean isAdd = db.go.runNonQuery(strInsert);
     if(isAdd){
         Tools.msgBox("Project is Added");
     }
    }

    @Override
    public void update() {
          String strUpdate = "update project set "
                  + "ProjectName='" + ProjectName + "',"
                  + "Location='" + Location + "',"
                  + "DeptNo=" + DeptNo
                  + " where ProjectNo=" + ProjectNo;
        boolean isUpdate = db.go.runNonQuery(strUpdate);
     if(isUpdate){
         Tools.msgBox("Project is Updated");
     }          
    }

    @Override
    public void delete() {
         String strDelete = "delete from project "
                 + " where ProjectNo=" + ProjectNo;
            boolean isDelete = db.go.runNonQuery(strDelete);
     if(isDelete){
         Tools.msgBox("Project is deleted");
     } 
    }

    @Override
    public void getAllRows(JTable table) {
         db.go.fillToJTable("project_data", table);
    }

    @Override
    public void getOneRow(JTable table) {
          String strSelect = "select * from project_data"
                  + " where project_no=" + ProjectNo;
          db.go.fillToJTable(strSelect, table);
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
        db.go.fillToJTable("project_data", table);
    }

    @Override
    public String getAutoNumber() {
           return db.go.getAutoNumber("project", "projectno");
    }

    @Override
    public String getValueByName(String name) {
          String strSelect = "select projectNo from project"
                  + " where projectName='" + name + "'";
          String strVal = (String)db.go.getTableData(strSelect).Items[0][0];
          return strVal;
    }

    @Override
    public String getNameByValue(String value) {
         String strSelect = "select ProjectName from project"
                 + " where ProjectNo=" + value;
         String strVal = (String)db.go.getTableData(strSelect).Items[0][0];
         return strVal;
    }

    public int getProjectNo() {
        return ProjectNo;
    }

    public void setProjectNo(int ProjectNo) {
        this.ProjectNo = ProjectNo;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public int getDeptNo() {
        return DeptNo;
    }

    public void setDeptNo(int DeptNo) {
        this.DeptNo = DeptNo;
    }
    
}
