
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Studant s1 = new Studant(1, "Issam drmas", "AA11", "Programmer", 11);
        System.out.println(s1.getAllDataInString());

        Studant s2 = new Studant(22, "Ahmed issam", "BB22", "Studant", 22);
        System.out.println(s2.getAllDataInString());
        
         Studant s3 = new Studant(33, "Aly issam", "CC33", "Since", 33);
         System.out.println(s3.getAllDataInString());
*/
        /*
        java.util.Scanner s = new java.util.Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        System.out.println("Enter the number 1:");
        num1 = s.nextDouble();
         System.out.println("Enter the number 2:");
        num2 = s.nextDouble();
        Calc c = new Calc(num1, num2);
        System.out.println(c.Add());
        System.out.println(c.Sub());
        System.out.println(c.Multi());
        System.out.println(c.Div());
*/
    
/*
       // String_Tools c = new String_Tools();
       // c.printCharByChar();
       // c.printCharByCharInverse();
       String [] str1 = {"drmas", "drmas", "drmas"}, 
                 str2 = {"drmas", "drmas", "drmas"},
                 str3 = {"drmas", "drmas", "drmas"};
   
String str[] = {"ahmed", "sissam", "ally", "drmas", "wjdan"};
   String_Tools c = new String_Tools(str);
   System.out.println(c.getStringArryElement()); 

int nums[] = {5, 4, 9, 10, 5};
IntgerTools i = new IntgerTools(nums);  
System.out.println(i.getSumArray()); 
   int nums1[] = {5, 4, 3, 2};
   int nums2[] = {10, 5, 8, 7};
   int result[];
   IntgerTools i = new IntgerTools(nums1, nums2);
   result = i.getAddtionTowArrays();
  for(int num : result){
        System.out.println(num);
    }
*/
/*
      Object[] obj1 = {"drmas", "aly", "nora", 'W', 5}; 
      Object[] obj2 = {"nader", "aly", "ahmed", true, 1.5};
      Object[] objR;
    
      MiargeArray m = new MiargeArray(obj1, obj2);
      objR = m.mergeTowArrays();
      for(Object o : objR){
          System.out.println(o);
      }
    */  
 /*      
String namesTable[][] = new String[3][4];
namesTable[0][0] = "Ahmed";
namesTable[0][1] = "Drmas";
namesTable[0][2] = "Issam";
namesTable[0][3] = "amany";

namesTable[1][0] = "Aymed";
namesTable[1][1] = "Ally";
namesTable[1][2] = "Badwer";
namesTable[1][3] = "Ihab";

namesTable[2][0] = "Aymed3";
namesTable[2][1] = "Ally3";
namesTable[2][2] = "Badwer3";
namesTable[2][3] = "Ihab3";

   for(int x = 0; x < namesTable.length; x++){
        for(int y = 0; y < namesTable[x].length; y++){
            System.out.print(namesTable[x][y] + " ; ");
        }
        System.out.println();

   for(String str[] : namesTable){
       for(String str2 : str){
           System.out.print(str2 + ": ");
       }
       System.out.println();
   }
   */ 
 /*
 String names1[] = {"drmas", "ahmed", "amr"};
 String names2[] = {"drmas", "ahmed", "amr"};
 String names3[] = {"drmas", "ahmed", "amr"};
 String namesTable[][] = {names1, names2, names3};
 
 String namesTables2[][] = {{"A", "B", "C" }, {"E", "D", "F"}};
 */
 
 /*     Table t = new Table(3);
      Object r1[] = {"ahmed1", "sara1", "amar1"};
      Object r2[] = {"ahmed2", "sara2", "amar2"};
      Object r3[] = {"ahmed3", "sara3", "amar3"};
      t.addNewRow(r3);
      t.addNewRow(r2);
      t.addNewRow(r1);
      t.addNewRow(new Object[] {"amany", "kale", "najoi"} );
      
      t.editRow(1, 2, "Waleed");
      t.editRow(2, 0, "Awaed");
      
      // t.deleteRow(2);
     // System.out.println(t.getValue(1, 1));
       System.out.println(t.getRow(2)[2]);
      
      t.printItems(); */
 
 /////////////////////////////////////////////
      // MyClass.msgBox("Hello");
      // MyClass.CreateFolder("DRMASO");
       MyClass.OpenForm(new frmTest());
       
       
    } //endding  
}

