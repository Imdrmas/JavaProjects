
package inheritance;

enum FloorType{ in, out; }

public enum Floor {
   F1(1, "Floor1"), F2(2, "Floor 3"), F3(3, "Floor3"), F4(4, "Floor4");
   
   private static final Floor[] ENUMS = Floor.values();
   
   public static Floor of(int floor){
       if (floor < 1 || floor > 4){
         System.out.println("Out of range");
        return null;
       } else {
    return ENUMS[floor -1];
    }         
   } 
   
   private int num;
   private String name;
   public FloorType type;
   

       private Floor(int num, String name){
       this.num = num;
       this.name = name;
   }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
      
} // rndding
