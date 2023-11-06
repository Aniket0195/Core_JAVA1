

public class Student {
	private int studentId;
	private String name;
	private int m1,m2,m3;
	//private double gpa;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
//	public double getGpa() {
//		return gpa;
//	}
//	public void setGpa(double gpa) {
//		this.gpa = gpa;
//	}
	public Student()
	{
		super();
	}
	public Student(int studentId, String name, int m1, int m2, int m3)
	{
		this.studentId= studentId;
		this.name = name ;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		//this.gpa = gpa;
	}
	
//	public void displayStudent()
//	{
//	System.out.println("StudentId: "+this.studentId);
//	System.out.println("name: "+this.name);
//	System.out.println("M1: "+m1);
//	System.out.println("M1: "+m2); 
//	System.out.println("M1: "+m3); 
//	}

}
