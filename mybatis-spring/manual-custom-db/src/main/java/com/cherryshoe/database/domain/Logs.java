package com.cherryshoe.database.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class Logs implements Serializable {

	private static final long serialVersionUID = 8751282105532159742L;

	private Integer logsId; // primaryKey
	private String fromSender;
	private String subject;
	private Timestamp sentDate;

	public Integer getLogsId() {
		return logsId;
	}

	public void setLogsId(Integer logsId) {
		this.logsId = logsId;
	}

	public String getFromSender() {
		return fromSender;
	}

	public void setFromSender(String fromSender) {
		this.fromSender = fromSender;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Timestamp getSentDate() {
		return sentDate;
	}

	public void setSentDate(Timestamp sentDate) {
		this.sentDate = sentDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((fromSender == null) ? 0 : fromSender.hashCode());
		result = prime * result + ((logsId == null) ? 0 : logsId.hashCode());
//		result = prime * result
//				+ ((sentDate == null) ? 0 : sentDate.hashCode());
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
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
		Logs other = (Logs) obj;
		if (fromSender == null) {
			if (other.fromSender != null)
				return false;
		} else if (!fromSender.equals(other.fromSender))
			return false;
		if (logsId == null) {
			if (other.logsId != null)
				return false;
		} else if (!logsId.equals(other.logsId))
			return false;
//		if (sentDate == null) {
//			if (other.sentDate != null)
//				return false;
//		} else if (!sentDate.equals(other.sentDate))
//			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Logs [logsId=" + logsId + ", fromSender=" + fromSender
				+ ", subject=" + subject + ", sentDate=" + sentDate + "]";
	}

}
