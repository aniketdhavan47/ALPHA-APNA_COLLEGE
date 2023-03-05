package com.module14;

public class PenClass {
	public static void main(String[] args) {
		Pen p1= new Pen();
		p1.setColor("Red");
		p1.setPrice(10);
		//we can set color without calling method
		p1.color="Blue";
		System.out.println(p1.color);

	}

}
class Pen{
	String color;
	int price;
	void setColor(String color) {
		this.color=color;
		System.out.println("new Color is : "+color);
	}
	void setPrice(int price) {
		this.price=price;
		System.out.println("New price is : "+price);
	}
}
