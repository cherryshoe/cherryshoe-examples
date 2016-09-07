create table status (	
  status_id VARCHAR2(64 BYTE) not null,
  status_status NUMBER(1,0) not null,
  status_request clob not null,
  status_created_date TIMESTAMP (6) with time zone default SYSTIMESTAMP not null,
  status_modified_date TIMESTAMP (6) with time zone default SYSTIMESTAMP not null,
  CONSTRAINT pk_status_id PRIMARY KEY (status_id)
);