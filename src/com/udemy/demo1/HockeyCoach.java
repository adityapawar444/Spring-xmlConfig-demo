package com.udemy.demo1;

public class HockeyCoach implements Coach {

	
	private Motivationhandler motivationHandler;
	private String name;
	private String contact;
	
	/*
	 * public HockeyCoach(Motivationhandler mHnadler) { this.motivationReader =
	 * mHnadler; }
	 */
	
	
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
		
		return "Watch how Major Dhyanchand played.";
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

}
