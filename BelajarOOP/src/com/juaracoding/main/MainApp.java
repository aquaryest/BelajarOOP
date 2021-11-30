package com.juaracoding.main;

public class MainApp {

	public static void main(String[] args) {
	//start run program
		
		BidangRuang bidang1 = new BidangRuang();  //instance
		
		bidang1.setNama("Lingkaran");
		
		Segitiga segitiga = new Segitiga();
		segitiga.setNama("Segitiga Sama Sisi");
		segitiga.gambarRuang();
		
		Kotak kotak = new Kotak();
		kotak.setNama("Kotak");
		kotak.gambarRuang();
		
		BidangRuang [] ruang = new BidangRuang[2];
		
		ruang[0] = segitiga;
		ruang[1] = kotak;
		
		for (int i = 0; i < ruang.length; i++) {
			
			ruang[i].gambarRuang();
		}
		
		Tesseract tesseract = new Tesseract();
		
		MainanBalok mainan = new MainanBalok();
		
		mainan.add(kotak);
		mainan.add(segitiga);
		mainan.add(tesseract);
		
		mainan.mainkanSemua();
		
		
		// buatlah sebuah array yang bisa menampung kotak dan segitiga, kemudian perintahkan untuk gambarRuang;
		
		
	}
	
	
}
