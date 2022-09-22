package Inheritance;

public class Population {
	public static void main(String args[]) 
	{
		int before_population = 175000;
		int after_population = 262500;
		int years_gap = 10;
		
		float increased_population = after_population - before_population;
		float increase_percentage = increased_population /before_population *100;
		float average_increase =  increase_percentage/years_gap;
		
		System.out.println("The average percent increase of population per year is : " + average_increase + "%");
	}
}
