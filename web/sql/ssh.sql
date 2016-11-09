CREATE database ssh CHARACTER SET utf8;
use ssh;
create table users(
  id VARCHAR(32) not null,
  name VARCHAR(20),
  pwd VARCHAR(20)

);
alter table users add CONSTRAINT users_pk PRIMARY KEY(id);
INSERT into users values('1','admin','1234');