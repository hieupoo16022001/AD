package School;


import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    Scanner scanner = new Scanner(System.in);
    public static ArrayList<Student> Student;
    private int StudentId;
    private String StudentName;
    private String Address;
    private int Phone;

    public Student(int StudentId, String StudentName, String Address, int Phone){
        this.StudentId = StudentId;
        this.StudentName = StudentName;
        this.Address = Address;
        this.Phone = Phone;
    }
        public int getStudentId(){
        return StudentId;
    }
        public void setStudentId(int StudentId) {
        StudentId = StudentId;
    }
        public String getStudentName(){
        return StudentName;
    }
        public void setStudentName(String StudentName) {
        StudentName = StudentName;
    }
        public String getAddress(){
        return Address;
    }
        public void setAddress(String Address){
        this.Address = Address;
    }
        public int getPhone(){
        return Phone;
    }
        public void setPhone(int Phone){
        this.Phone = Phone;
    }



}
