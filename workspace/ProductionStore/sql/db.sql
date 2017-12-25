drop database if exists db;
create database db;
use db;

create table users(
user_id int primary key auto_increment,
user_name varchar(255),
password varchar(255)
);

insert into users values(1,"bh","225");