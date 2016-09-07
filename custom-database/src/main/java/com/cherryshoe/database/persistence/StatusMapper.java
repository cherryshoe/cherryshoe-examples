package com.cherryshoe.database.persistence;

import com.cherryshoe.database.domain.Status;

public interface StatusMapper {

  Status getStatusById(String statusId);

  void insertStatus(Status status);

  void updateStatus(Status status);

}
