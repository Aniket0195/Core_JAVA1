
public class StudentService {

	static Student [] sarr;
	static int cnt;
	
	static
	{
		sarr =  new Student[100];
		sarr[0] = new Student(1,"Rutvik",80,90,70);
		sarr[1] = new Student(2,"Aniket",80,45,70);
		sarr[2] = new Student(3,"Ram",40,90,70);
		sarr[3] = new Student(4,"Shyam",80,67,70);
		cnt = 4;
		
	}
	
	public static void displayAll()
	{
		for(int i = 0;i<cnt;i++)
		{
			System.out.println(sarr[i]);
		}
	}
	
	public static Student searchById(int id)
	{
		for (Student s: sarr)
		{
			if(s!=null)
			{
				if(s.getStudentId()==id)
				{
					return s;
				}
			}
			else 
				return null;
	
		}
		return null;
	}
	public static Student searchByName(String nm)
	{
		for(Student s: sarr)
		{
			if(s!=null)
			{
				if(s.getName()==nm)
				{
					return s;
				}
			}
			else 
				return null;
	
		}
		return null;
		}
	
	public static void calculateGPA(int id)
	{
		float gpa = 0;
		for (Student s: sarr)
		{
			if(s!=null)
			{
				if(s.getStudentId()==id)
				{
					int m1 = s.getM1();
					int m2 =s.getM2();
					int m3 = s.getM3();
					gpa=(float)(((0.33)*m1)+((0.50)*m2)+((0.25)*m3));
					System.out.println("The GPA of student is : "+gpa);
					break;
				}
				else
					{
					System.out.println("Student not found");
					break;
					}
				
			}
			
		}
		
	}
}



