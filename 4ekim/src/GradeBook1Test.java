import java.util.Scanner;
public class GradeBook1Test {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		GradeBook1 myGradeBook1 = new GradeBook1();
		System.out.println("Please enter the course name:");
		String nameOfCourse=input.nextLine();
		System.out.println("");
		myGradeBook1.displayMessage(nameOfCourse);
		
	}
	

}
