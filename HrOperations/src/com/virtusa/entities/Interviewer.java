package com.virtusa.entities;

public class Interviewer extends User{
	
public Interviewer() {
		
	}
	private ConductInterview conductInterview;
	private UpdateResult updateResult;
	private String interviewerId;
	public ConductInterview getConductInterview() {
		return conductInterview;
	}
	public void setConductInterview(ConductInterview conductInterview) {
		this.conductInterview = conductInterview;
	}
	public UpdateResult getUpdateResult() {
		return updateResult;
	}
	public void setUpdateResult(UpdateResult updateResult) {
		this.updateResult = updateResult;
	}
	public String getInterviewerId() {
		return interviewerId;
	}
	public void setInterviewerId(String interviewerId) {
		this.interviewerId = interviewerId;
	}
	@Override
	public String toString() {
		return "Interviewer [conductInterview=" + conductInterview
				+ ", updateResult=" + updateResult + ", interviewerId="
				+ interviewerId + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((conductInterview == null) ? 0 : conductInterview.hashCode());
		result = prime * result
				+ ((interviewerId == null) ? 0 : interviewerId.hashCode());
		result = prime * result
				+ ((updateResult == null) ? 0 : updateResult.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Interviewer other = (Interviewer) obj;
		if (conductInterview == null) {
			if (other.conductInterview != null)
				return false;
		} else if (!conductInterview.equals(other.conductInterview))
			return false;
		if (interviewerId == null) {
			if (other.interviewerId != null)
				return false;
		} else if (!interviewerId.equals(other.interviewerId))
			return false;
		if (updateResult == null) {
			if (other.updateResult != null)
				return false;
		} else if (!updateResult.equals(other.updateResult))
			return false;
		return true;
	}
	
}
