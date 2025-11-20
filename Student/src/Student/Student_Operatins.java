package Student;

import java.util.ArrayList;

public interface Student_Operatins {
	public void findstudent(int id, ArrayList<Student>studentlist);
	public void addstudent(int id, ArrayList<Student>studentlist);
	public void deletestudent(int id, ArrayList<Student>studentlist);
	public void displaystudent(int id, ArrayList<Student>studentlist);
	public void countstudent(int id, ArrayList<Student>studentlist);

}
