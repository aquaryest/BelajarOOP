package com.juaracoding.main;

public class Segitiga extends BidangRuang implements Ruang2D{
	
	private float alas = 0;
	private float tinggi = 0;
	
	
     public Segitiga() {
		// TODO Auto-generated constructor stub
	}
     
     public Segitiga(float alas, float tinggi) {
    	 
    	 this.alas = alas;
    	 this.tinggi = tinggi;
    	 
     }
	
	@Override
	public void gambarRuang() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
	}

	@Override
	public float luas() {
		// TODO Auto-generated method stub
		return 0.5f * alas * tinggi;
	}

	@Override
	public float keliling() {
		// TODO Auto-generated method stub
		return 3*alas;
	}

	public float getAlas() {
		return alas;
	}

	public void setAlas(int alas) {
		this.alas = alas;
	}

	public float getTinggi() {
		return tinggi;
	}

	public void setTinggi(int tinggi) {
		this.tinggi = tinggi;
	}
	
	
	
	
}
