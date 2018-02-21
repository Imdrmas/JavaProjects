
package inheritance;

public class EmpEnum {
    
    public EmpEnum(Floor WorkFloor, FloorType Type){
        this.WorkFloor = WorkFloor;
        this.type = Type;
    }
    
    public int EmpNo;
    public String EmpName;
    public String Address;
    private final Floor WorkFloor;
    public final FloorType type;

    public Floor getWorkFloor() {
        return WorkFloor;
    }


    
    
}
