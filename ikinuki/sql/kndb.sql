set names utf8;
set foreign_key_checks = 0;

drop database if not exists kndb;
create database kndb;
use kndb;

drop table if exists favorite;
create table favorite(
item_id int primary key auto_increment,
item_name varchar(255)
);

insert into favorite values(1,"nanika");