
package inheritance;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    
    public void GetPersonType(){
        System.out.println("Person ");
    }
    
    public Person(String PersonName){
        Name = PersonName;
    }
    String ID;
    String Name;
    String address;
    String BDate;
    String Phone;
    
    public int CalcDateOFBD(int BDYear){
        Date d = new Date();
        SimpleDateFormat f = new SimpleDateFormat("YYYY");
        int YearNow = Integer.parseInt(f.format(d));
        int YearBD = BDYear;
        int BD = YearNow - YearBD;
        return BD;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBDate() {
        return BDate;
    }

    public void setBDate(String BDate) {
        this.BDate = BDate;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
    
}
