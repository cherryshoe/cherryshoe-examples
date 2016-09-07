-- drop table STATUS;
drop table status if exists

create table status (
    status_id varchar(64) not null,
    status_status int not null,
    status_request clob not null,
    status_created_date timestamp not null,
    status_modified_date timestamp not null,
	CONSTRAINT pk_status_id PRIMARY KEY (status_id)
);
  