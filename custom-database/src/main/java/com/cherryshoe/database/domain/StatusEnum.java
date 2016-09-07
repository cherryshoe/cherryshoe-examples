package com.cherryshoe.database.domain;

public enum StatusEnum {
  NOT_PROCESSED(-1),
  IN_PROCESS(1),
  PROCESSED(2);
  
  private int status;

  private StatusEnum(int status) {
      this.status = status;
  }

	public Integer getStatus() {
		return status;
	}
}
