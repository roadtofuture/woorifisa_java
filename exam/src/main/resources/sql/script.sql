drop database if exists test;
create database test;
use test;

create table member(
  member_id varchar(100) primary key,
  member_pass varchar(100) not null,
  member_name varchar(100) not null
);

insert into member values("hong","1234","홍길동"),
                         ("jang","1234","장길산"),
                         ("1","1234","1"),
                         ("2","1234","2"),
                         ("3","1234","3"),
                         ("4","1234","4"),
                         ("5","1234","5"),
                         ("6","1234","6"),
                         ("7","1234","7"),
                         ("8","1234","8"),
                         ("9","1234","9"),
                         ("10","1234","10");