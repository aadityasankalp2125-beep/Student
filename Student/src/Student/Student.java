package Student;

public class Student {
	private String name;
	private int id;
	private String branch;
	private long phone;
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", branch=" + branch + ", phone=" + phone + "]";
	}
	public Student() {
		super();
	}
	public Student(String name, int id, String branch, long phone) {
		super();
		this.name = name;
		this.id = id;
		this.branch = branch;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	

}
