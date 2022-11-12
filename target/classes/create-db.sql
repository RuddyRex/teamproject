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
id int(3) primary key,
name varchar(20), 
email varchar(20),
created_at timestamp,
password varchar(20) ,
);
drop table post if exists;
createtablepost (
id int(3) primary key,
name varchar(20), 
email varchar(20),
created_at timestamp,
password varchar(20) ,
);