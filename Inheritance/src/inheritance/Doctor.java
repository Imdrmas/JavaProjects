
package inheritance;

public class Doctor extends Employee{
    
    @Override
    public void GetPersonType(){
        System.out.println("Doctor ");
    }
    
    public Doctor(String PersonName){
        super(PersonName);
    }
    
    public String DoctoralYear;
    public String DoctoralTitle;
    public String DoctroalDetails;

    public String getDoctoralYear() {
        return DoctoralYear;
    }

    public void setDoctoralYear(String DoctoralYear) {
        this.DoctoralYear = DoctoralYear;
    }

    public String getDoctoralTitle() {
        return DoctoralTitle;
    }

    public void setDoctoralTitle(String DoctoralTitle) {
        this.DoctoralTitle = DoctoralTitle;
    }

    public String getDoctroalDetails() {
        return DoctroalDetails;
    }

    public void setDoctroalDetails(String DoctroalDetails) {
        this.DoctroalDetails = DoctroalDetails;
    }
    
}
