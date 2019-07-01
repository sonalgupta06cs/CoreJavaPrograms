package com.java.hackerrank.thirtydayschallenge;
import java.lang.Math;

public class Day2 {
	
	
	// Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {

                 double tipcost, totalCostBeforeRound, taxAmount;
                 int totalFinalCost;
                 
                 tipcost = (meal_cost*tip_percent)/100;
                 System.out.println(tipcost);
                 
                 taxAmount = (meal_cost*tax_percent)/100;
                 System.out.println(taxAmount);
                 
                 totalCostBeforeRound = meal_cost + tipcost + taxAmount;
                 System.out.println(totalCostBeforeRound);
                 
                 totalFinalCost = (int)Math.round(totalCostBeforeRound);
                 System.out.println(totalFinalCost);

    }

	public static void main(String[] args) {

		double meal_cost = 12;

        int tip_percent = 20;

        int tax_percent = 8;
		
		solve(meal_cost, tip_percent, tax_percent);

	}

}
