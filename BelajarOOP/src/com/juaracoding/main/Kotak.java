package com.juaracoding.main;

public class Kotak extends BidangRuang {
	
	
	@Override
	public void gambarRuang() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <10; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
