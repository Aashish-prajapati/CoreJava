package com.rays.oop;

public class Automobile {
private String color;
private int speed;
private String make;
public  static final int NO_OF_GEARS=5;
public Automobile() {}
public Automobile(String c,String m,int s) {
	color=c;
	make=m;
	speed=s;
}
public String getcolor() {
	return color;
	 
 }
public int getspeed() {
	return speed;

}
public String getmake() {
	return make;

}
public static int getNO_OF_GEARS() {
	return NO_OF_GEARS;
}
public void brake() {int b= 100;
 switch(b) {
 case 40:
	 System.out.println("pls apply brake");
 
 }
	
}


}
