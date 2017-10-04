
public class GradeBook2 {

		private String courseName;
		
		public void setCourseName(String name) {
			courseName=name;
		}
		public String getCourseName() {
			return courseName;
		}
		public void displayMessage() {
			System.out.printf("Welcome to the grade book for %s",getCourseName());
		}
}
