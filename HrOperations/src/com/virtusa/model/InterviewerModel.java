package com.virtusa.model;

public class InterviewerModel
{
	private int interviewerId;
	private String EmailId;
	private String userName;
	public int getInterviewerId() {
		return interviewerId;
	}
	public void setInterviewerId(int interviewerId) {
		this.interviewerId = interviewerId;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "InterviewerModel [interviewerId=" + interviewerId
				+ ", EmailId=" + EmailId + ", userName=" + userName + "]";
	}

}
