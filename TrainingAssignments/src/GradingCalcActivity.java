public class GradingCalcActivity {
	
	public static void main(String[] args) {
		
		int[] gradeArr = {95, 85, 62, 40, 79};
		
		String[] subjects = {"Math", "English", "Science", "History", "Art"};
		
		char[] letterGrades = new char[gradeArr.length];
		
		for(int i = 0; i < gradeArr.length; i++) {
			
			if(gradeArr[i] >= 90) {
				letterGrades[i] = 'A';
			} // if
			
			else if(gradeArr[i] >= 80 && gradeArr[i] < 90) {
				letterGrades[i] = 'B';
			} // else if
			
			else if(gradeArr[i] >= 70 && gradeArr[i] < 80) {
				letterGrades[i] = 'C';
			} // else if
			
			else if(gradeArr[i] >= 60 && gradeArr[i] < 70) {
				letterGrades[i] = 'D';
			} // else if
			
			else {
				letterGrades[i] = 'F';
			} // else
			
		} // for ()
		
	} // main
} // GradingCalcActivity