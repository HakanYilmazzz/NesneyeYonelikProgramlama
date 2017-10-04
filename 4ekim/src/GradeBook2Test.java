import java.util.*;
public class GradeBook2Test {

	public static void main(String[] args) {
		GradeBook2 myGradeBook2 = new GradeBook2();
		Scanner input= new Scanner(System.in);
		System.out.println("Course name is:" + myGradeBook2.getCourseName());
		System.out.println("Please enter the course name:");
		String Name = input.nextLine();
		myGradeBook2.setCourseName(Name);
		myGradeBook2.displayMessage();
	}

}
