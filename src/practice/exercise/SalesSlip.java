package practice.exercise;

import java.util.Random;

public class SalesSlip {
	
	Random randomNumber = new Random();
	
	// 
	int[] Person1(){
		
		int product_sales[] = new int[5]; // array to store the total sales for each product for this person
		
		// loop to assign the sales amounts for each product
		for(int i = 0; i < product_sales.length; i++)
		{
			product_sales[i] = getRandomNumber();
		} // for loop
		
		return product_sales; 
	} // end method Person1()
	
	int[] Person2(){
		
		int product_sales[] = new int[5];
		
		for(int i = 0; i < product_sales.length; i++)
		{
			product_sales[i] = getRandomNumber();
		} // for loop
		
		return product_sales;
	} // end method Person2()

	int[] Person3(){
	
		int product_sales[] = new int[5];
	
		for(int i = 0; i < product_sales.length; i++)
		{
			product_sales[i] = getRandomNumber();
		} // for loop
	
		return product_sales;
	} // end method Person3()

	int[] Person4(){
	
		int product_sales[] = new int[5];
	
		for(int i = 0; i < product_sales.length; i++)
		{
			product_sales[i] = getRandomNumber();
		} // for loop
	
		return product_sales;
	} // end method Person4()
	
	
	int getRandomNumber(){
		
		int random_number = randomNumber.nextInt(100);
		
		return random_number;
	} // end method getRandomNumber()

} // end class SaleSlip
