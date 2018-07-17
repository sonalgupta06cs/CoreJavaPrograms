package com.java.collection.ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// We use comparator when .class file does not have implementation of 
// Comparable interface or if we have, then when we want to change the
// sorting logic like if we want to sort the Laptops based on RAM size.
class Laptops implements Comparable<Laptops> {

	String brand;
	int price;
	int RAM;

	public Laptops(String brand, int price, int rAM) {
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
	public int compareTo(Laptops o) {
		if (this.getPrice() > o.getPrice()) {
			return 1;
		} else if (this.getPrice() < o.getPrice()) {
			return -1;
		}
		return 0;
	}
}
// Laptops have defined their own way of sorting, what if we want to chnage the sorting logice.
public class ComparatorDemo {

	public static void main(String[] args) {

		List<Laptops> lapList = new ArrayList<>();
		lapList.add(new Laptops("Dell", 1000, 16));
		lapList.add(new Laptops("HP", 800, 8));
		lapList.add(new Laptops("Apple", 1600, 16));
		lapList.add(new Laptops("Acer", 600, 4));

		Collections.sort(lapList, new Comparator<Laptops>() {

			@Override
			public int compare(Laptops lap1, Laptops lap2) {

				if (lap1.getRAM() > lap2.getRAM()) {
					return 1;
				} else if (lap1.getRAM() < lap2.getRAM()) {
					return -1;
				} else {
					return 0;
				}

			}
		});

		for (Laptops lap : lapList) {

			System.out.println(lap);

		}

	}

}
