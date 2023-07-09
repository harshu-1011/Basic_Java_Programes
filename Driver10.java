package pack1;

import java.util.ArrayList;

public class Driverl 
{

 public static void main(String[] args) 
 {


	ArrayList a= new ArrayList();



	Scanner s =new Scanner(System.in); 
	 for (int i=1;i<=3;i++) {

		System.out.println(("Enter question id")); 
		int question_id=s.nextInt();

		System.out.println("Enter Question description");

		String question_des=s.nextLine();
			s.nextLine();
		question_des=s.nextLine();

		System.out.println("Enter the number of years and then enter years");

			

			int size=s.nextInt();

		
			int[] year=new int[size];

			for (int j=0;j<year.length; j++) {

			year[]=s.nextInt();

			

			System.out.println("Enter the concept");

			s.nextLine();

			

			String concept=s.nextLine();
			
			a.add(new QuestionDetails(question id, question des, year, concept));
			
			System.out.println("The choices are");

			System.out.println("1.Get question from a particular year");

			System.out.println("2.Get the max repeated concept");

			int choice=s.nextInt();

			switch (choice) {

			case 1:

			System.out.println("Enter the year");

			int years.nextInt();
			ArrayList<String>res=QuestionDetails.getMaxQuestion (year, a); 
			for (int i=0;i<res.size();i++) {

			System.out.println(res.get(i));

			break;

			case 2:

			System.out.println (QuestionDetails.getMaxConcept (a)); 
			break;
			
			}
			}
			}