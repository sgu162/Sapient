package com.training.apps;

import com.training.ifaces.Automobile;
import com.training.domains.ShowRoom;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowRoom showroom = new ShowRoom();
		Automobile auto=null;
		
		int key=1;
		auto=showroom.getItem(key);
		if(auto!=null )
		showroom.printQuote(auto);
		else
			System.out.println("invalid");
	

	}

}
