drop schema public cascade;
drop table user if exists;
create table user (
id int primary key,
name varchar(20), 
email varchar(20),
created_at timestamp,
password varchar(20) 
);
drop table follower if exists;
create table follower (
id int primary key,
name varchar(20), 
alias varchar(20),
created_at timestamp,
role varchar(20) ,
);
drop table post if exists;
create table post (
id int primary key,
title varchar(20), 
content varchar(200),
created_at timestamp,
);