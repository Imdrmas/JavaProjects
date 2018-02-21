public class Studant{
    
    public Studant(int studant_number, String studant_Code, String studant_name, 
            String studant_branch, double Garde ){
        System.out.println("\nNew Studant is Created...");
        studantNumber = studant_number;
        studantCode = studant_Code;
        studantName = studant_name ; 
        BranchName = studant_branch;
        grade = Garde;
    }

    int  studantNumber;
    String studantCode;
    String studantName;
    String BranchName;
   double grade;
    
    String[] getAllData(){
        String strAll[] = {String.valueOf(studantNumber), studantCode, 
            studantName, BranchName, String.valueOf(grade)};
        return strAll;
    }
    String getAllDataInString(){
        String strAlls = String.valueOf(studantNumber) + "-" + studantCode + ": " 
                + studantName + "; " + BranchName + ": "+ grade;
        return strAlls;
    }
  }