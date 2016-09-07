package com.cherryshoe.database.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class Status implements Serializable {

	private static final long serialVersionUID = 8751282105532159742L;

	private Timestamp statusCreatedDate;
	private Timestamp statusModifiedDate;
	private String statusId;
	private Integer statusStatus;
	private String statusRequest;

	public Timestamp getStatusCreateDate() {
		return statusCreatedDate;
	}

	public void setStatusCreateDate(Timestamp statusCreatedDate) {
		this.statusCreatedDate = statusCreatedDate;
	}

	public Timestamp getStatusModifiedDate() {
		return statusModifiedDate;
	}

	public void setStatusModifiedDate(Timestamp statusModifiedDate) {
		this.statusModifiedDate = statusModifiedDate;
	}

	public String getStatusId() {
		return statusId;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}

	public Integer getStatusStatus() {
		return statusStatus;
	}

	public void setStatusStatus(Integer statusStatus) {
		this.statusStatus = statusStatus;
	}

	public String getStatusRequest() {
		return statusRequest;
	}

	public void setStatusRequest(String statusRequest) {
		this.statusRequest = statusRequest;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((statusRequest == null) ? 0 : statusRequest.hashCode());
		result = prime * result
				+ ((statusStatus == null) ? 0 : statusStatus.hashCode());
		result = prime * result
				+ ((statusId == null) ? 0 : statusId.hashCode());
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
		Status other = (Status) obj;
		if (statusRequest == null) {
			if (other.statusRequest != null)
				return false;
		} else if (!statusRequest.equals(other.statusRequest))
			return false;
		if (statusStatus == null) {
			if (other.statusStatus != null)
				return false;
		} else if (!statusStatus.equals(other.statusStatus))
			return false;
		if (statusId == null) {
			if (other.statusId != null)
				return false;
		} else if (!statusId.equals(other.statusId))
			return false;
		
		// do not put date in equals, they will never be equal
		
		return true;
	}

	@Override
	public String toString() {
		return "Status [statusCreatedDate=" + statusCreatedDate + ", statusModifiedDate="
				+ statusModifiedDate + ", statusId=" + statusId
				+ ", statusStatus=" + statusStatus + ", statusRequest=" + statusRequest + "]";
	}




}
