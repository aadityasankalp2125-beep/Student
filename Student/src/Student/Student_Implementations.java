package Student;

import java.util.ArrayList;

public class Student_Implementations implements Student_Operatins {

	@Override
	public void findstudent(int id, ArrayList<Student> studentlist) {
		 
		for (Student s : studentlist) {
		        if (s.getId() == id) {
		            System.out.println("Student found: " + s);
		            return;
		        }
		    }
		    System.out.println("Student with ID " + id + " not found.");	
	}

	@Override
	public void addstudent(int id, ArrayList<Student> studentlist) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletestudent(int id, ArrayList<Student> studentlist) {
		
		for (Student student : studentlist) {
	        if (student.getId() == id) {
	            studentlist.remove(student);
	            System.out.println("Student with ID " + id );
	            return;
	        }
	    }
	    System.out.println("Student with ID " + id + " not found.");
	}

	@Override
	public void displaystudent(int id, ArrayList<Student> studentlist) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void countstudent(int id, ArrayList<Student> studentlist) {
		// TODO Auto-generated method stub
		
	}

}
