
package business;


public class Student {
    private int studentNo;
    private String studentName;
    private String studentAddress;
    //This is comment
    public Student(){
        
    }

    public Student(int studentNo, String studentName, String studentAddress) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

   

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
}
