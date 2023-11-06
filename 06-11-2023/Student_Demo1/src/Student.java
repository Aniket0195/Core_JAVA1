
public class Student {
	private int studentId;
	private String name;
	private int m1,m2,m3;
	
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
	}
	
	public void displayStudent()
	{
	System.out.println("StudentId: "+this.studentId);
	System.out.println("name: "+this.name);
	System.out.println("M1: "+m1);
	System.out.println("M1: "+m2); 
	System.out.println("M1: "+m3); 
	}

}
