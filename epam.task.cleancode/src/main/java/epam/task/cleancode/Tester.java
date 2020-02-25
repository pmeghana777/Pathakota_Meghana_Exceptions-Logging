package epam.task.cleancode;

import java.util.Scanner;
import org.apache.logging.log4j.*;

import org.apache.logging.log4j.LogManager;

public class Tester {
	 
	private static Logger LOGGER = LogManager.getLogger(Tester.class);

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Calculation calculate = new Calculation();
		
		ConstructionBudget budget = new ConstructionBudget();
		
		
		LOGGER.info("Enter 1 to calculate Simple Interest  or 2 to calculate Compound Interest");
		int option = input.nextInt();
		LOGGER.info("You entered option" + " " + option);
		LOGGER.info("Enter principal , rate , time values");
		double principal = input.nextDouble();
		double rate = input.nextDouble();
		double time = input.nextDouble();
		LOGGER.info("Entered values are " + "principal = " + principal + " rate = " + rate + " time = " + time);
		switch(option){
		case 1:
			LOGGER.info("Simple Interest calculated is : " + calculate.computesSimpleInterest(principal, rate, time));
			break;
		case 2:
			LOGGER.info("Compound Interest calculated is " + calculate.computesCompoundInterest(principal, rate, time));
			break;
		default:
			LOGGER.info("Invalid option entered");
		}
		
		
		LOGGER.info("Enter Standard of the house to be consturcted");
		LOGGER.info("Enter 1 for normal 2 for medium 3 for high");
		int standard = input.nextInt();
		LOGGER.info("Entered standard is " + standard);
		int fullyAutomated;
		if( standard == 3){
			LOGGER.info("Enter 1 for fully automated house else enter 0");
			fullyAutomated = input.nextInt();
			LOGGER.info("Entered value is " + fullyAutomated);
		}else{
			fullyAutomated = 0;
			
		}
		LOGGER.info("Enter the area ");
		double area = input.nextDouble();
		LOGGER.info("Area entered is " + area);
		LOGGER.info("Budget calculated is " + budget.calculatesConstructionCost(area, standard, fullyAutomated));
		
		
		

	}

}
