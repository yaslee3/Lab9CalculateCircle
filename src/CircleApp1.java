import java.util.Scanner;

public class CircleApp1 {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the circle tester");
		Scanner sc = new Scanner (System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")){
			System.out.println("Enter radius");
			double radius = sc.nextDouble();
			CircleObject1 c = new CircleObject1(radius);
			
			System.out.println("Circumference:" + c.getFormattedCircumference() );
			System.out.println("Area :" + c.getFormattedArea() );
			
			choice= sc.nextLine();
			System.out.println("Continue?(y/n)");
			choice= sc.nextLine();
			System.out.println();
			
			
		}
		if (choice.equalsIgnoreCase("n")){
			System.out.println("GoodBye.you created" + CircleObject1.getObjectCount() + "Circle Object (s).");
		}
	}


		
		//Create a Scanner object named scan from the Scanner class
		
		//display a welcome message
		
		// prompt the user to enter radius
		
		//get input from user
		
		//convert the object to a double value
		
		
	}

