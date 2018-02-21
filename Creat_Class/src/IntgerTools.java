public class IntgerTools {
    public int numbers[]; 
    public int numbers1[];
    public int numbers2[];
    private int sum;
    
       public IntgerTools(int numbers1[], int numbers2[]){
       this.numbers1 = numbers1;
       this.numbers2 = numbers2;
   }
   
   public IntgerTools(int numbers[]){
       this.numbers = numbers;
   }
   public int getSumArray(){
     for(int num : numbers){
         sum += num;
     }
     return sum;
   }
   
  public int[] getAddtionTowArrays(){
       int numAdd[] = new int[numbers1.length];
      if(numbers1.length != numbers2.length){
          System.out.println("The Two Arrays Not Equals");
          return numAdd;
      } else{
          for(int x = 0; x < numbers.length; x++){
              numAdd[x] = numbers1[x] + numbers2[x];
          }
          return numAdd;
      }
  }
   
   
  
} // endding














