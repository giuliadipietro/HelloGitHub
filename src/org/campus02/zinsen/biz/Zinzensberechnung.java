package org.campus02.zinsen.biz;

public class Zinzensberechnung {

	public static double zinsensberechnung(int kapital, int tage, int zinssatz){
	double zinsen = kapital * tage * zinssatz / 36000;
	System.out.println(zinsen + "%");
	return zinsen;
	}
}
