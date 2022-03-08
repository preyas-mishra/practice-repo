
public class IfElseExample {

	public static void main(String[] args) {
		int testScore;
		testScore = 50;
		char grade = 'A';
		if(testScore>80) {
			grade = 'A';
		}
		else if(testScore>60) {
			grade = 'B';
		}
		else if(testScore>=40) {
			grade = 'C';
		}
		else if(testScore<40) {
			grade = 'D';
		}
		System.out.println("Grade "+grade);
		
		

	}

}
