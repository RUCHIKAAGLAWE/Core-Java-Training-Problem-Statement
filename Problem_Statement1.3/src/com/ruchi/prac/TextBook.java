package com.ruchi.prac;

import java.util.Scanner;

class Book {

	  String book_title;
	  double book_price;
	 
	  Book (String title,double price){
		  book_title =title;
		  book_price =price;
	  }
	  double getBook_price() {
		  return book_price;
	  }
	void setBook_price(double p) {
		book_price=p;
	  }
	
	String getBook_title() {
		  return book_title;
	  }
	void setBook_title(String s) {
		book_title=s;
	  }
}

public class TextBook {
	static Scanner sc = new Scanner(System.in);
	private static int n;
	public static void creatBooks(Book[] b) {
		for(int i=0;i<b.length;i++) {
	    System.out.println("Enter book" +(i+1)+"details:");
	    System.out.println("Title:");
	    sc.nextLine();
	    String t = sc.nextLine();
	    System.out.print("Price:");
	    double p= sc.nextDouble();
	    b[i]= new Book(t,p);
		}
	}
	public static void createBooks(Book[] b) {
		System.out.println("Book Title\t\tPrice");
	    System.out.println("---------------------------------------------");
		String r="RS";
		for(int i=0;i<b.length;i++) {
		    System.out.printf("%-20s%6s",b[i].getBook_title(),r);
		    System.out.println(b[i].getBook_price());
		}
	}
  public static void main(String args[]) {
	  System.out.println("Number of books"); 
	  Book[] b = new Book[n];
	  createBooks(b);
	  showBooks(b);
  }
private static void showBooks(Book[] b) {
	// TODO Auto-generated method stub
	
     }
  }

	