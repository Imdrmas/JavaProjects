
public class QuestionBank {
    private String textQuestions [] = {
        "1. What is the capitale of France",
        "2. What is the capitale of Germany",
        "3. What is the capitale of UK"
    };
    
 private String multipeChoice [][] = {
     {"paris", "london", "prlin"},
     {"london", "paris", "prlin"},
     {"prlin", "london", "paris"}
 };   
    
  private String mCorrectAnswer[] = {
      "paris", "london", "prlin"
  };  
   
  public int getLength(){
      return textQuestions.length;
  }
   
  public String getQuestions(int a){
   String question = textQuestions[a];  
   return question;
  }
    
  public String getChoice(int index, int num){
      String choice0 = multipeChoice[index][num];
      return choice0;
  }
  
  public String getCorrectAnswer(int a){
      String answer = mCorrectAnswer[a];
      return answer;
  }

    String getQuestions(int mQuestionNumber, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}// endding
