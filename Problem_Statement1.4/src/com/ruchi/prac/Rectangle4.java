package com.ruchi.prac;

public class Rectangle4 
{

	Double length=1.0,width=1.0;

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		if(length>0.0 && length<20.0)
		{
		this.length = length;
		}
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		if(width>0.0 && width<20.0)
		{
		this.width = width;
		}
	}
	
	public void area()
	{
		double area;
		double perimeter;
		area=length *width;
		perimeter=2*(length+width);
		
		displayInformation(area,perimeter);
		 
	}
	
	
	
	public void displayInformation(double area,double perimeter)
	{
		System.out.println("length of Rectangle:"+ length);
		System.out.println("Breath of Rectangle:"+ width);
		System.out.println("Area of Rectangle:"+ area);
		System.out.println("Perimeter of Rectangle:"+ perimeter);
	
	}	
}