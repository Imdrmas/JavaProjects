
package Entity;

import company.Tools;
import javax.swing.JTable;

public class Department implements mainData {
    private int DeptNo;
    private String DeptName;
    private String Location;

    public int getDeptNo() {
        return DeptNo;
    }

    public void setDeptNo(int DeptNo) {
        this.DeptNo = DeptNo;
    }

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String DeptName) {
        this.DeptName = DeptName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    @Override
    public void add() {
        String strinsert = "insert into department values("
                + DeptNo + ","
                + "'" + DeptName + "',"
                + "'" + Location + "')";
        boolean isAdd = db.go.runNonQuery(strinsert);
        if(isAdd){
            Tools.msgBox("Department Is Added");
        } 
    }

    @Override
    public void update() {
        String strUpdate = "update department set "
                + "DeptName='" + DeptName + "',"
                + "Location='" + Location + "' "
                + " where DeptNo=" + DeptNo; 
        boolean IsUpdate = db.go.runNonQuery(strUpdate);
        if(IsUpdate){
            Tools.msgBox("Department Is Updated");
        }
    }

    @Override
    public void delete() {
        String strdelete = "delete from department"
                + " where DeptNo=" + DeptNo;
        boolean isDelete = db.go.runNonQuery(strdelete);
        if(isDelete){
            Tools.msgBox("Department Is Deleted");
        }
    }

    @Override
    public void getAllRows(JTable table) {
        db.go.fillToJTable("department_data", table);
    }

    @Override
    public void getOneRow(JTable table) {
        String strSelect = "select * from department_data "
                + " where DEPARTMENT_DEPTNO=" + DeptNo;
        db.go.fillToJTable(strSelect, table);
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
        db.go.fillToJTable(statement, table);    
    }

    @Override
    public String getAutoNumber() {
        String strAuto = db.go.getAutoNumber("department", "DeptNo");
        return strAuto;
    }

    @Override
    public String getValueByName(String name) {
        String strSelect = "select deptno from department"
                + " where deptname='" + name + "'";
        String strVal = (String)db.go.getTableData(strSelect).Items[0][0];
        return strVal;
    }

    @Override
    public String getNameByValue(String value) {
        String strSelect = "select deptname from department"
                + " where deptno=" + value;
        String strName = (String)db.go.getTableData(strSelect).Items[0][0];
        return strName;
    }
    
}
