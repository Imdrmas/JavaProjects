
package testarray;

public class TestArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
       String rooms[][][] = new String[2][3][2];
       rooms[0][0][0] = "Drmas";
       rooms[0][0][1] = "Maroo";
       rooms[0][1][0] = "issam";
       rooms[0][1][1] = "Tamer";
       rooms[0][2][0] = "Wled";
       rooms[0][2][1] = "Kaled";
       rooms[1][1][0] = "Ahmed";
      for (int b = 0; b < rooms.length; b++){
          System.out.println("Building " +(b+1));
        for (int f = 0; f < rooms[b].length; f++){
            for (int r = 0; r < rooms[b][f].length; r++){
                System.out.print(rooms[b][f][r] + ": ");
                
            }
            System.out.println();
        }
        System.out.println();
    }
      
      // int i[][][] = { {{ 1,2,3 }, {11, 22, 33}}, {{ 4,5,6},{7,8,9}} };
      //System.out.println(i[1][1][2]);
*/
        int i[][][][][] = new int[2][2][4][2][2];
        i[0][0][0][0][1] = 122;
        System.out.println(i[0][0][0][0][1]);
        
    } //endding    
}
