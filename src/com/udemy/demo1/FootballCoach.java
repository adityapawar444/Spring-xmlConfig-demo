package com.udemy.demo1;

public class FootballCoach implements Coach {
	
	private Motivationhandler motivationHandler;
	private String name;
	private String contact; 
	
	/*// use this when property passed as constructor argument
	 * FootballCoach(Motivationhandler mhandler){ this.motivationHandler = mhandler;
	 * }
	 */
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public FootballCoach() {
	}

	@Override
	public String getAdvice() {
		return "Play as a Team";
	}

	@Override
	public String getMotivated() {
		// TODO Auto-generated method stub
		return this.motivationHandler.readQuote();
	}

	public Motivationhandler getMotivationHandler() {
		return motivationHandler;
	}

	public void setMotivationHandler(Motivationhandler motivationHandler) {
		
		this.motivationHandler = motivationHandler;
	}

}
