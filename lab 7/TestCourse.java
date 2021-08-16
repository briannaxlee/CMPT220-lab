package lab7;

public class TestCourse
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Course course = new Course("Software Development 1");
		
		for (int i = 0; i < 5; i++)
		{
			course.addStudent("Student " + (i + 1));
		}
		
		String[] students = course.getStudents();
		System.out.println(course.getCourseName());
		for (int i = 0; i < students.length; i++)
		{
			System.out.println(students[i]);
		}
		
		System.out.println(" ");
		System.out.println("Number of students in Software Development 1: " + course.getNumberOfStudents());
		System.out.println(" ");
		
		System.out.println("Adding 3 students to the course...");
		course.addStudent("Student 6");
		course.addStudent("Student 7");
		course.addStudent("Student 8");
		System.out.println(" ");
		
		System.out.println("Number of students in Software Development 1: " + course.getNumberOfStudents());
		System.out.println(" ");
		
		System.out.println("Dropping a student from the course...");
		System.out.println("Dropping Student #1 from the course. ");
		
		course.dropStudent("Student" + (1));
		
		System.out.println(" ");
		
		System.out.println("Displaying course roster: ");
		
		String[] updatedStudents = course.getStudents();
		
		for (int i = 0; i < course.getNumberOfStudents(); i++)
		{
			System.out.println(updatedStudents[i]);
		}
		
		System.out.println(" ");
		
		System.out.println("Number of students in Software Development 1: " + course.getNumberOfStudents());
		
	}

}
