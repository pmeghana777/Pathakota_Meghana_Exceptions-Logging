package epam.task.cleancode;

public class ConstructionBudget {
	double calculatesConstructionCost(double area,int standard, int fullyAutomated){
		
		double costPerSquareFeet;
		
		int prizePerSquareFeet;
		
		if( standard == 1){
			
			prizePerSquareFeet = 1200;
			
		} else if(standard == 2){
			
			prizePerSquareFeet = 1500;
			
		}else{
			
			if(fullyAutomated == 0){
				
				prizePerSquareFeet = 1800;
				
			}else{
				
				prizePerSquareFeet = 2500;
				
			}
			
		}
		
		costPerSquareFeet = area*prizePerSquareFeet;
		
		return costPerSquareFeet;
	}
	
}
