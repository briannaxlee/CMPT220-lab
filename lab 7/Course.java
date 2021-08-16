package lab7;

public class Course
{
	private String courseName;
	private String[] students = new String[10];
	private int numberOfStudents;
	
	public Course(String courseName)
	{
		this.courseName = courseName;
	}
	
	public void addStudent(String student)
	{
		if (numberOfStudents < 100)
		{
			students[numberOfStudents] = student;
			numberOfStudents++;
		}
	}
	
	public String[] getStudents()
	{
		String student[] = new String[numberOfStudents];
		for (int index = 0; index < numberOfStudents; index++)
		{
			student[index] = this.students[index];
		}
		return student;
	}
	
	public int getNumberOfStudents()
	{
		return numberOfStudents;
	}
	
	public String getCourseName()
	{
		return courseName;
	}
	
	public void dropStudent(String student)
	{
		for (int i = 0; i < students.length; i++)
		{
			students[i] = null;
			numberOfStudents--;
			while (i < numberOfStudents)
			{
				students[i] = students[i+1];
				i++;
			}
			break;
		}
	}
	
	public void clear()
	{
		students = new String[10];
		numberOfStudents = 0;
	}
}