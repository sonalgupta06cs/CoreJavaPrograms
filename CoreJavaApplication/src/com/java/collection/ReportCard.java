package com.java.collection;

public class ReportCard {
	
	private int mathscore;

	public ReportCard() {
		this.mathscore = (int) (Math.random()*101 + 1);
	}

	public int getMathscore() {
		return mathscore;
	}

	public void setMathscore(int mathscore) {
		this.mathscore = mathscore;
	}
	
	

}
