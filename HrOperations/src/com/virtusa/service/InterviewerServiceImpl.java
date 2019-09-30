package com.virtusa.service;

import com.virtusa.dao.InterviewerDAO;

public class InterviewerServiceImpl implements InterviewerService
{
	private InterviewerDAO interviewerDAO=null;

	public InterviewerServiceImpl(InterviewerDAO interviewerDAO) {
		super();
		this.interviewerDAO = interviewerDAO;
	}
	

}
