package practice.exercise;

public class Sales {

	SalesSlip slips = new SalesSlip();
	
	private int sales[][] = new int[5][4];
	private int[] slip;
	
	// Just to test second committ
	// constructor to initialise array with the sales of each person
	public Sales() {
		
		slip = slips.Person1(); //
		// populates first column of the array with the sale of each product for person1
		for(int row = 0; row < slip.length; row++)
		{
			sales[row][0] = slip[row];
		}
		
		slip = slips.Person2();
		// populates second column of the array with the sale of each product for person2
		for(int row = 0; row < slip.length; row++)
		{
			sales[row][1] = slip[row];
		}
		
		slip = slips.Person3();
		// populates third column of the array with the sale of each product for person3
		for(int row = 0; row < slip.length; row++)
		{
			sales[row][2] = slip[row];
		}
		
		slip = slips.Person4();
		// populates forth column of the array with the sale of each product for person4
		for(int row = 0; row < slip.length; row++)
		{
			sales[row][3] = slip[row];
		}
		
	} // end method setSales
	
	void displaySales(){
		
		// print headings
		System.out.println("         ________Sales Persons________      ");
		
		System.out.print("Products |");
		for(int i = 0; i < 4; i++)
		{
			System.out.printf(" #%d |\t ", i+1);
		}
		System.out.println("TOTAL");
		System.out.println();
		
		// print table
		for(int row = 0; row < sales.length; row++)
		{
			System.out.printf("#%-8d|", row+1);
			for(int column = 0; column < 4; column++)
			{
				System.out.printf(" %2d |\t ", sales[row][column]);
			} // end inner for loop
			
			System.out.println(getProductTotal(row));
			
		} // ends outer for loop

		System.out.println();
		
		// print columns total
		System.out.print("TOTAL    |");
		for(int column = 0; column < 4; column++)
		{
			System.out.printf(" %3d|\t ", getPersonTotal(column));
		}
		
	} // end method displaySales
	
	// calculates the total for a particular row in the array
	private int getProductTotal(int product_row) {
		
		int total = 0;
		
		for(int column = 0; column < 4; column++)
		{
			total += sales[product_row][column];
		}
		
		return total;
	}
	
	// calculate the total for a particular column in the array
	private int getPersonTotal(int person_column) {
		
		int total = 0;
		
		for(int row = 0; row < 5; row++)
		{
			total += sales[row][person_column];
		}
		
		return total;
	}
	
} // end class Sales

// Just to test second commit
