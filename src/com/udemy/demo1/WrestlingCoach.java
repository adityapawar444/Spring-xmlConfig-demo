package com.udemy.demo1;

public class WrestlingCoach implements Coach{
	
	private Motivationhandler motivationHandler;
	private String name;
	private String contact; 
	
	/*
	 * public WrestlingCoach(Motivationhandler mHandler) { this.motivationReader =
	 * mHandler; }
	 */
	
	@Override
	public String getAdvice() {
		return "Build a strong body";
	}
	
	@Override
	public String getMotivated() {
		
		return motivationHandler.readQuote();
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getContact() {
		return this.contact;
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

}
