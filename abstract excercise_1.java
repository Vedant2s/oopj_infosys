abstract class Student{
    //Implement your code here
    private String studentName;
    private int testScores[]=new int[4];
    private String testResult;
    public void generateResult(){
    }
    Student(String name){
    studentName=name;
    }
    public void setTestScore(int testnumber,int testscore){
    testScores[testnumber]=testscore;
    }
    public String getStudentName(){
    return studentName;
    }
    public void setStudentName(String name){
    studentName=name;
    }
    public int[] getTestScores(){
    return testScores;
    }
    public String getTestResult(){
    return testResult;
    }
    public void setTestResult(String Result){
    testResult=Result;
    }
}

class UndergraduateStudent extends Student {
    //Implment your code here
    UndergraduateStudent(String name){
    super(name);
    }
    @Override
    public void generateResult(){
    int[] sum=new int[4];
    sum=getTestScores();
    float avg=0;
    for(int i=0;i<4;i++){
    avg=sum[i]+avg;
    }
    avg=avg/4;
    if(avg>=60)
    setTestResult("Pass");
    else
    setTestResult("Fail");

    }
    
}

class GraduateStudent extends Student{
    //Implment your code here
    GraduateStudent(String name){
    super(name);
    }
    @Override
    public void generateResult(){
    int[] sum=new int[4];
    sum=getTestScores();
    float avg=0;
    for(int i=0;i<4;i++){
    avg=sum[i]+avg;
    }
    avg=avg/4;
    if(avg>=70)
    setTestResult("Pass");
    else
    setTestResult("Fail");
    }
    
}

class Tester {

    public static void main(String[] args) {
        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Philip");
        undergraduateStudent.setTestScore(0, 70);
        undergraduateStudent.setTestScore(1, 69);
        undergraduateStudent.setTestScore(2, 71);
        undergraduateStudent.setTestScore(3, 55);
            
        undergraduateStudent.generateResult();
            
        System.out.println("Student name: "+undergraduateStudent.getStudentName());
        System.out.println("Result: "+undergraduateStudent.getTestResult());
            
        System.out.println();
            
        GraduateStudent graduateStudent = new GraduateStudent("Jerry");
        graduateStudent.setTestScore(0, 70);
        graduateStudent.setTestScore(1, 69);
        graduateStudent.setTestScore(2, 71);
        graduateStudent.setTestScore(3, 55);
            
        graduateStudent.generateResult();
            
        System.out.println("Student name: "+graduateStudent.getStudentName());
        System.out.println("Result : "+graduateStudent.getTestResult());
        
        //Create more objects of the classes for testing your code
    }
}
