/*
 3. Write a menu driven program to maintain student information. Modify Student class 
created in previous assignment. Add a member gpa in student class, add a function in 
student class to return GPA of a student
 calculateGPA()
 gpa=(1/3)*m1+(1/2)*m2+(1/4)*m3
Create an array to store Multiple students.
1. Display All Student
2. Search by id
3. Search by name
4. calculate GPA of a student
5. Exit
*/
import java.util.Scanner;
public class StudentTest {
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
	int choice=0;
		do
		{
			System.out.println("1. Display All Student\n2. Search by ID\n3. Search by Name\n4. Calculate GPA\n5. Exit");
			System.out.println("Enter choice");
			choice = sc.nextInt();
				switch(choice)
				{
				case 1:
					StudentService.displayAll();
					break;
				case 2:
				{
					System.out.println("Enter the id of student for search");
					int id = sc.nextInt();
					Student ob =StudentService.searchById(id);
					System.err.println(ob);
					
				}
					break;
				case 3:
				{
					System.out.println("Enter the name of student for search");
					String nm = sc.next();
					Student ob = StudentService.searchByName(nm);
					System.out.println(ob);
				}
					break;
				case 4:
				{
					System.out.println("Enter the no of student whose gpa you want to calculate");
					int id = sc.nextInt();
					StudentService.calculateGPA(id);
				}
					
					break;
				case 5:
					break;
				}
		}while(choice!=5);
sc.close();
	}
	
}
