package com.example.OnlineJobPortal.Dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class RecruiterDto {

	
	private int recruiterdtoid;
	@NotEmpty(message = "first name cannot be empty")
	private String firstName;
	@NotEmpty(message = "last name cannot be empty")
	private String lastName;
	@NotEmpty(message = "password cannot be blank")
	@Pattern(regexp="^(?=.*[0-9])(?=.*[a-z])(?=\\S+$).{8,20}$", message="pas should be of more than 8 characters")
	private String password;
	public int getRecruiterdtoid() {
		return recruiterdtoid;
	}
	public void setRecruiterdtoid(int recruiterdtoid) {
		this.recruiterdtoid = recruiterdtoid;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public RecruiterDto(int recruiterdtoid, @NotEmpty(message = "first name cannot be empty") String firstName,
			@NotEmpty(message = "last name cannot be empty") String lastName,
			@NotEmpty(message = "password cannot be blank") @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=\\S+$).{8,20}$", message = "pas should be of more than 8 characters") String password) {
		super();
		this.recruiterdtoid = recruiterdtoid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
	}
	public RecruiterDto() {
		super();
	}

	
}
