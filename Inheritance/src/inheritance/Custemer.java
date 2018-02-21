
package inheritance;

public class Custemer extends Person{
    
    
        @Override
    public void GetPersonType(){
        System.out.println("Customer ");
    }
    
    public Custemer(String PersonName){
        super(PersonName);
    }
   public String shipmentAdress;
   public String ShipmentPhone;
   public String likeName;

    public String getShipmentAdress() {
        return shipmentAdress;
    }

    public void setShipmentAdress(String shipmentAdress) {
        this.shipmentAdress = shipmentAdress;
    }

    public String getShipmentPhone() {
        return ShipmentPhone;
    }

    public void setShipmentPhone(String ShipmentPhone) {
        this.ShipmentPhone = ShipmentPhone;
    }

    public String getLikeName() {
        return likeName;
    }

    public void setLikeName(String likeName) {
        this.likeName = likeName;
    }
}
