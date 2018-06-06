package com.java.collection.ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// We use comparable when the objects that we want to sort are not
// comparable so the objects that we want to sort should implement the 
// Comparable interface & provide their sorting logic,like if we want to
// sort the Laptop based on price in ascending order..
class Laptop implements Comparable<Laptop>{
	
	String brand;
	int price;
	int RAM;
	
	public Laptop(String brand, int price, int rAM) {
		super();
		this.brand = brand;
		this.price = price;
		RAM = rAM;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRAM() {
		return RAM;
	}
	public void setRAM(int RAM) {
		this.RAM = RAM;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", RAM=" + RAM + "]";
	}

	@Override
	public int compareTo(Laptop o) {
		if(this.getPrice() > o.getPrice()) {
			return 1;
		}
		else if(this.getPrice() < o.getPrice()) {
			return -1;
		}
		return 0;
	}	
}

public class ComparableDemo {

	public static void main(String[] args) {
		
		List<Laptop> lapList = new ArrayList<>();
		lapList.add(new Laptop("Dell", 1000, 8));
		lapList.add(new Laptop("HP", 800, 8));
		lapList.add(new Laptop("Apple", 1600, 8));
		lapList.add(new Laptop("Acer", 600, 8));
		
		Collections.sort(lapList);
		
		for(Laptop lap:lapList) {
			
			System.out.println(lap);
			
		}

	}

}
