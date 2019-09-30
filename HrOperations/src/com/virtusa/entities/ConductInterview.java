package com.virtusa.entities;



public class ConductInterview 
{
	private String interviewPlace;
	private int InterviewLocationId;
	public String getInterviewPlace() {
		return interviewPlace;
	}
	public void setInterviewPlace(String interviewPlace) {
		this.interviewPlace = interviewPlace;
	}
	public int getInterviewLocationId() {
		return InterviewLocationId;
	}
	public void setInterviewLocationId(int interviewLocationId) {
		InterviewLocationId = interviewLocationId;
	}
	@Override
	public String toString() {
		return "ConductInterview [interviewPlace=" + interviewPlace
				+ ", InterviewLocationId=" + InterviewLocationId + "]";
	}
	
	
	

}
