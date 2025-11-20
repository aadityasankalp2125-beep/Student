package Student;

import java.util.ArrayList;

public class Std_test {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        Student_Implementations impl = new Student_Implementations();

        impl.addstudent(101, list);

        System.out.println(list);  
    }
}
