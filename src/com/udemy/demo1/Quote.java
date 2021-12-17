package com.udemy.demo1;

import java.util.Random;

public class Quote implements Motivationhandler{
	
	private String quotes[];
	public Quote() {
	}

	@Override
	public String readQuote() {
		Random random = new Random();
		int r = random.nextInt(quotes.length);
		//System.out.println("r= " + r);
		//System.out.println(quotes);
		return quotes[r];
	}

	public String[] getQuotes() {
		return quotes;
	}

	public void setQuotes(String quotes[]) {
		this.quotes = quotes;
	}
	
	/*
	 * below are the life-cycle method - ref in xml file
	 */
	public void start() {
		System.out.println("init method " + this);
	}
	
	public void end() {
		System.out.println("destroy method");
	}
	

}
