package Main;
import Function.function;
import School.Student;

import java.awt.font.LineBreakMeasurer;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    Scanner scanner = new Scanner(System.in);
    int n;
    final int SENTINEL = 0;
    public void menu() {
        System.out.println("!.Add student records");
        System.out.println("2.Display student records ");
        System.out.println("3.Save");
        System.out.println("4.Exit");
    }

    public void Chose(){
            n = scanner.nextInt();
            main m = new main();
            while (n != SENTINEL){
switch (n){
    case 1:
        System.out.println("Add");
        break;

    case 2:
        System.out.println("Print Out");
            m.InsertStudent();
    case 3:
        System.out.println("Save");
    case 4:
        System.out.println("EXIT");
        break;
}

            }
    }

    public void InsertStudent() {

        System.out.println("Điền Thông Tin Sinh Viên");
        System.out.println("Nhập Id Sinh Viên:");
        int StudentId = scanner.nextInt();
        System.out.println("Nhập tên sinh viên:");
        String StudentName = scanner.nextLine();
        System.out.println("Nhập địa chỉ:");
        String Address = scanner.nextLine();
        System.out.println("Nhập số điện thoại:");
        int Phone = scanner.nextInt();


    }
}