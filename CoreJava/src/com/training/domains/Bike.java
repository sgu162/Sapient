package com.training.domains;

import com.training.ifaces.Automobile;
public class Bike implements Automobile {

	public String getColor() {
		// TODO Auto-generated method stub
		return "Yellow";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 2000000.00;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Ducati";
}

}