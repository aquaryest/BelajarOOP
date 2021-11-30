package com.juaracoding.main;

import java.util.ArrayList;
import java.util.List;

public class MainanBalok {
	
	List<IMainan> lstMainan = new ArrayList<IMainan>();

	public void add (IMainan mainan) {
		lstMainan.add(mainan);
	}
	
	
	public void mainkanSemua () {
		for (IMainan mainan : lstMainan) {
			mainan.mainkan();
		}
	}
}
