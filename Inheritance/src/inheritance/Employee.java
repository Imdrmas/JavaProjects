
package inheritance;

public class Employee extends Person{
    public Floor WorkFloor;
    
    @Override
    public void GetPersonType(){
        System.out.println("Employee ");
    }
    public Employee(String PersonName){
        super(PersonName);
    }
    public String SSN;
    public String HireDate;
    public int StartSalary;
    public int CurrentSalary;

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getHireDate() {
        return HireDate;
    }

    public void setHireDate(String HireDate) {
        this.HireDate = HireDate;
    }

    public int getStartSalary() {
        return StartSalary;
    }

    public void setStartSalary(int StartSalary) {
        this.StartSalary = StartSalary;
    }

    public int getCurrentSalary() {
        return CurrentSalary;
    }

    public void setCurrentSalary(int CurrentSalary) {
        this.CurrentSalary = CurrentSalary;
    }
    
}
