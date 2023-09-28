import dto.ReadAndWrite;
import student.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Long", "Hà Nội"));
        students.add(new Student("Long1", "Hà Nội"));
        students.add(new Student("Long2", "Hà Nội"));
        students.add(new Student("Long3", "Hà Nội"));
        students.add(new Student("Long4", "Hà Nội"));
        ReadAndWrite.writeFile("ReadAndWriteData/student.txt",students);
        List<Student> studentList = ReadAndWrite.readFile("ReadAndWriteData/student.txt");
        for (Student student: studentList) {
            System.out.println(student);
        }
    }
}