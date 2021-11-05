package ss5_static_access_modifier.demo_manager_student.service;




import ss5_static_access_modifier.demo_manager_student.model.Student;

import java.util.Scanner;

public class StudentService {
    private Scanner scanner = new Scanner(System.in);
    public static Student[] studentList = new Student[100];
    static {
        studentList[0]=new Student(1,"chanh1",23,"DN",5,"Toán");
        studentList[1]=new Student(2,"chanh2",23,"DN",5,"Toán");
        studentList[2]=new Student(3,"chanh3",23,"DN",5,"Toán");
    }
    // them, sưa, xóa, hien thi thông tin student
    public void add(){
        /// code thêm mới
        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("nhập môn học");
        String subject = scanner.nextLine();
        System.out.println("nhập điểm");
        int point = Integer.parseInt(scanner.nextLine());
        Student student = new Student(id,name,age,address,point,subject);

        for (int i=0;i<studentList.length;i++){
            if (studentList[i]==null){
                studentList[i]=student;
                break;
            }
        }
    }
    public void display(){
        System.out.println("hiên thi ra danh sách");
        for (Student student: studentList) {
            if (student !=null){
                System.out.println(student.toString());
            }else {
                break;
            }
        }
        //code
    }
    public void delete(){
        System.out.println("nhập vào id cần xóa");
        int  id = Integer.parseInt(scanner.nextLine());
        for (int i=0;i<studentList.length;i++){
            if (id == studentList[i].getId()){
                for (int j=i;j<studentList.length-1;j++){
                    studentList[j]=studentList[j+1];
                }
                break;
            }

        }

        // code delete
        display();

    }
    public void edit(){
        // code sửa
    }
}
