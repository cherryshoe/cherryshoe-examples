package com.cherryshoe.database.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cherryshoe.database.domain.Status;
import com.cherryshoe.database.persistence.StatusMapper;
import com.google.common.base.Preconditions;

@Service
public class CherryShoeStatusDao {

  @Autowired
  private StatusMapper statusMapper;

  public Status getStatus(String statusId) {
    return statusMapper.getStatusById(statusId);
  }

  @Transactional
  public void insertStatus(Status status) {
	// check preconditions with google guava
	Preconditions.checkNotNull(status.getStatusCreateDate(), "statusCreateDate is required");
	Preconditions.checkNotNull(status.getStatusModifiedDate(), "statusModifiedDate is required");
	Preconditions.checkNotNull(status.getStatusId(), "statusId is required");
	Preconditions.checkNotNull(status.getStatusRequest(), "statusRequest is required");
	Preconditions.checkNotNull(status.getStatusStatus(), "statusStatus is required");
	
    statusMapper.insertStatus(status);
  }

  @Transactional
  public void updateStatus(Status status) {
	// check preconditions with google guava	
	
    statusMapper.updateStatus(status);
  }

}
