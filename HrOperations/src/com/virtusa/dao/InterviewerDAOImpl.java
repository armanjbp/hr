package com.virtusa.dao;

import com.virtusa.entities.Interviewer;
import com.virtusa.repository.InterviewerRepository;

public class InterviewerDAOImpl implements InterviewerDAO 
{

	@Override
	public boolean parsistjobinterview(Interviewer interviewer) {
		// TODO Auto-generated method stub
		return InterviewerRepository.add(interviewer);
	}
	

}
