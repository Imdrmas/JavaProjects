
package inheritance;

public class Student extends Person {
    
    @Override
    public void GetPersonType(){
        System.out.println("Student ");
    }
    public Student(String PersonName){
        super(PersonName);
    }
    public String cardId;
    public String breanchName;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getBreanchName() {
        return breanchName;
    }

    public void setBreanchName(String breanchName) {
        this.breanchName = breanchName;
    }
}
