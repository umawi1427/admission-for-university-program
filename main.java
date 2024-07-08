/*******************************************************************
@Title:	KourdiehHamzahCalculateGrades
@Purpose:	To practice java loop and conditional statements.
@Author:    (KOURDIEH HAMZAH)
@Date:   	(6.11.2023)
@Version:	8.17.1
********************************************************************/
import java.util.Scanner;


public class KourdiehHamzahCalculateGrades {
	public static void main (String args []) {

		Scanner Hamzah=new Scanner(System.in);
		boolean other=true;

		while (other){
			System.out.println("Please enter your midterm exam grade");
			double midExam = Hamzah.nextDouble();

			while(midExam > 100 || midExam < 0) {
				System.out.println("you can only enter values between 0 and 100");
		  	midExam = Hamzah.nextDouble();
		  	}

			System.out.println("Please enter your final exam grade");
			double finalExam = Hamzah.nextDouble();

			while (finalExam > 100 || finalExam < 0) {
				System.out.println("you can only enter values between 0 and 100");
				finalExam = Hamzah.nextDouble();
			}

			System.out.println("Please enter Assignment #1 grade");
			double Assignment1 = Hamzah.nextDouble();

			while(Assignment1 > 100 || Assignment1 < 0) {
				System.out.println("you can only enter values between 0 and 100");
				Assignment1 = Hamzah.nextDouble();
			}

			System.out.println("Please enter Assignment #2 grade");
			double Assignment2=Hamzah.nextDouble();

			while(Assignment2 > 100 || Assignment2 < 0) {
				System.out.println("you can only enter values between 0 and 100");
				Assignment2=Hamzah.nextDouble();
			}

			System.out.println("Please enter Assignment #3 grade");
			double Assignment3=Hamzah.nextDouble();

			while(Assignment3 > 100 || Assignment3 < 0) {
				System.out.println("you can only enter values between 0 and 100");
				Assignment3=Hamzah.nextDouble();
			}

			System.out.println("Please enter the lab grade before the midterm exam");
			double Lab1=Hamzah.nextFloat();

			while(Lab1 > 100 || Lab1 < 0) {
				System.out.println("you can only enter values between 0 and 100");
				Lab1=Hamzah.nextFloat();
			}

			System.out.println("Please enter the lab grade after the midterm exam");
			double Lab2=Hamzah.nextFloat();

			while(Lab2 > 100 || Lab2 < 0) {
				System.out.println("you can only enter values between 0 and 100");
				Lab2=Hamzah.nextFloat();
			}

			double midtermGrade=midExam*0.6f+Assignment1*0.1f+Assignment2*0.1f+Lab1*0.2f;
			double finalGrade=finalExam*0.6f+Assignment3*0.2f+Lab2*0.2f;
			System.out.printf("\nThe weighted midterm grade is "+ "%.2f", midtermGrade);
			System.out.printf("\nThe weighted final grade is "+ "%.2f", finalGrade);
			System.out.printf("\nFinal course grade is "+ "%.2f", (midtermGrade+finalGrade)/2);
			System.out.println("\nDo you want to calculate for another student? please type 'true' or 'false'");
			other=Hamzah.nextBoolean();
			if (!other){
				System.out.println("bye bye");
			}
		}
	}
}
