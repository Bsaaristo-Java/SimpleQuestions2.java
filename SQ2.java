public class PreCourseQ2 {

	public static void main(String[] args) {
		// Write an IF statement to determine if a number is positive or negative.
		              //inp
		double number1 = -7;
		if (number1 >= 0) {
			System.out.println("Positive");}
		else if (number1 < 0) {
			System.out.println("Negative");}
		
		// Write an IF statement to determine if a number is even or odd.
		double number2 = 242;
		if (number2 % 2 == 0) {
			System.out.println("Even");}
		else if (number2 % 2 != 0) {
			System.out.println("Odd");}
		
		//Convert a numeric grade to a letter grade.
		double grade1 = 76;
		if (grade1 >= 90){
			System.out.println("A");}
		else if (grade1 >= 80) {
			System.out.println("B");}
		else if (grade1 >= 72) {
			System.out.println("C");}
		else if (grade1 >= 64) {
			System.out.println("D");}
		else if (grade1 >= 0) {
			System.out.println("F");}
		else System.out.println("Invalid");
		
		//Convert a numeric day of the week to the weekday, with the first day 
		//0f the week being SundayMake a provision for an invalid weekday number.
		Scanner in = new Scanner(System.in);
		Integer ex = in.nextInt();
		
		if (ex == 1) {
			System.out.println("Sunday");}
		else if (ex == 2) {
			System.out.println("Monday");}
		else if (ex == 3) {
			System.out.println("Tuesday");}
		else if (ex == 4) {
			System.out.println("Wednesday");}
		else if (ex == 5) {
			System.out.println("Thursday");}
		else if (ex == 6) {
			System.out.println("Friday");}
		else if (ex == 7) {
			System.out.println("Saturday");}
		else System.out.println("Invalid");}
		}
              //done

          
