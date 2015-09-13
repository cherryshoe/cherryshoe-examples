-- drop table logs;
drop table Logs if exists

create table Logs (
    logs_id int not null,
    from_sender varchar(4000) not null,
    subject varchar(4000),
    sent_date timestamp(6) without time zone,
	CONSTRAINT logs_id_primary_key PRIMARY KEY (logs_id)
);
  