package com.training.domains;

import com.training.ifaces.Automobile;

public class ShowRoom  {

	public Automobile getItem(int key)
	{
		
		switch (key) {
		
		case 1:
			
			return new PassengerCar();
		
			
case 2:
			
			return new LuxuryCars();
		
			
case 3:
	
	return new SportsCar();

	
default:
	
	return null;

	}
	}
	/**
	 * 
	 * @param polyAuto takes the object of automobiles
	 * 
	 * Method prints the quotation of vehicle
	 */


	public void printQuote(Automobile polyAuto)
	{
		System.out.println("___Quotation___");
		System.out.println("color:"+polyAuto.getColor());
		System.out.println("Model:"+polyAuto.getModel());
		System.out.println("Price:=" +polyAuto.getPrice());
	}
}