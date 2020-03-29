package com.khuranasvivek.experts.domain;

/**
 * Security User Entity.
 *
 * Created by khuranavivek
 */
public class User {

    public User(String firstName, String lastName, String team, String expertise) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.team = team;
        this.expertise = expertise;
    }

  
    private String firstName;

    private String lastName;
    
    private String team;
    
    private String expertise;

    /**
     * Default Constructor.
     */
    protected User() {
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}
    
}
