set names utf8;
set foreign_key_checks = 0;
drop database if exists db;

create database if not exists db;
use db;

drop table if exists users;
create table users(
user_id int primary key auto_increment,
user_name varchar(255),
password varchar(255)
);

insert into users values(1,"bh","225");

drop table if exists login_user_transaction;

create table login_user_transaction(
id int not null primary key auto_increment,
login_id varchar(16) unique,
login_pass varchar(16),
user_name varchar(50),
insert_date datetime,
updated_date datetime
);

INSERT INTO login_user_transaction(login_id,login_pass,user_name)
VALUES("internous","internous01","test");

drop table if exists item_info_transaction;

create table item_info_transaction(
id int not null primary key auto_increment,
item_name varchar(30),
item_image varchar(255),
item_price int,
item_stock int,
insert_date datetime,
update_date datetime
);


INSERT INTO item_info_transaction(item_name,item_image,item_price,item_stock) VALUES("NoteBook","./image/phanpro.png",100,50);
INSERT INTO item_info_transaction(item_name,item_image,item_price,item_stock) VALUES("e","./image/phanpro.png",100,50);
INSERT INTO item_info_transaction(item_name,item_image,item_price,item_stock) VALUES("e2","./image/phanpro.png",100,50);
INSERT INTO item_info_transaction(item_name,item_image,item_price,item_stock) VALUES("e3","./image/phanpro.png",100,50);

drop table if exists user_buy_item_transaction;

create table user_buy_item_transaction(
id int not null primary key auto_increment,
item_transaction_id int,
total_price int,
total_count int,
user_master_id varchar(16),
pay varchar(30),
insert_date datetime,
delete_date datetime
);

insert into user_buy_item_transaction values(1,1,100,100,"1","クレジット","2018-01-12 00:00:00",null);

create table item_favorite(
id int not null primary key auto_increment,
item_transaction_id int,
user_master_id varchar(16),
insert_date datetime,
delete_date datetime
);


