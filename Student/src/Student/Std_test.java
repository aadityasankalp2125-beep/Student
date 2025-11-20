package Student;

import java.util.ArrayList;

public class Std_test {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        Student_Implementations impl = new Student_Implementations();

        list.add(new Student("Aaditya", 101,"cse",456789l));
        System.out.println("student added");
        System.out.println(list);
       
    }
}
