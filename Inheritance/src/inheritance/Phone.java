
package inheritance;

public class Phone {
    
    public Phone(String YourName){
        System.out.println("Phone is Created By "+ YourName + ".....");
    }
    
    public String name;
    private int buttonCount;
    private String screenDetails;

    public int getButtonCount() {
        return buttonCount;
    }

    public void setButtonCount(int buttonCount) {
        this.buttonCount = buttonCount;
    }

    public String getScreenDetails() {
        return screenDetails;
    }

    public void setScreenDetails(String screenDetails) {
        this.screenDetails = screenDetails;
    }
    
}
