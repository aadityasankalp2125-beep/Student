package Student;

import java.util.ArrayList;

public class Student_Implementations implements Student_Operatins {

    @Override
    public void addstudent(int id, ArrayList<Student> studentlist) {
        Student s = new Student("AADITYA", id, "CSE", 9864864895L);
        studentlist.add(s);
    }

    @Override
    public void findstudent(int id, ArrayList<Student> studentlist) {
        // leave empty for now
    }

    @Override
    public void deletestudent(int id, ArrayList<Student> studentlist) {
    }

    @Override
    public void displaystudent(int id, ArrayList<Student> studentlist) {
    }

    @Override
    public void countstudent(int id, ArrayList<Student> studentlist) {
    }
}
