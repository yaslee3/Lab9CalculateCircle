import java.util.Scanner;

public class CircleApp1 {

	public static void main(String[] args)  {
		
		//display a welcome message
				System.out.println("Welcome to the circle tester");
				
				//Create a Scanner object named scan from the Scanner class
				Scanner sc = new Scanner (System.in);
				String choice = "y";
				int min=1;
				int max=10;
				String prompt="Check radius range: enter number  ";
				//add while loop for the choice
				while (choice.equalsIgnoreCase("y")){
					
					Validator.getInt(sc, prompt, min, max);
					
					System.out.println(" ReEnter radius number ");
					
					// prompt the user to enter radius
				//	System.out.println("Enter radius");
					double radius = sc.nextDouble(); //get input from user
					
					CircleObject1 c = new CircleObject1(radius);
					
					// Add the formula for get the circumference and area to printout 
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



				
				
				
				
				
				
				//convert the object to a double value
				
				
			}

