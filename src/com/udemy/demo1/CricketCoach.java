package com.udemy.demo1;

public class CricketCoach implements Coach {
	
	private Motivationhandler motivationHandler;
	private String name;
	private String contact; 


	
	/*
	 * public CricketCoach(Motivationhandler mReader) { this.motivationReader =
	 * mReader; }
	 */

	public Motivationhandler getMotivationHandler() {
		return motivationHandler;
	}

	public void setMotivationHandler(Motivationhandler motivationHandler) {
		this.motivationHandler = motivationHandler;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	
	@Override
	public String getAdvice() {
		return "Be consistent in your practise!!!";
	}

	@Override
	public String getMotivated() {
		
		return motivationHandler.readQuote();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String getContact() {
		// TODO Auto-generated method stub
		return this.contact;
	}

}
