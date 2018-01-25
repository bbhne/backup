drop database if exists phantomdb;

create database if not exists phantomdb;
use phantomdb;


drop table if exists user_table;

create table user_table(
	user_number int not null primary key auto_increment,
	account_id varchar(30),
	user_name nvarchar(30),
	user_pass varchar(30),
	user_mail varchar(255)
);

	INSERT INTO user_table VALUES(1,"phantom_production","zahura","phantom225","phantompro225@yahoo.co.jp");
	INSERT INTO user_table VALUES(2,"phantom_production2","ザフラ","phantom225","zahura225@yahoo.co.jp");


drop table if exists item_table;

create table item_table(
	item_number int not null primary key auto_increment,
	item_name nvarchar(255),
	item_type nvarchar(255),
	item_price int,
	item_stock int
);

	INSERT INTO item_table VALUES(1,"OrcinusBlue","book",1000,9);
	INSERT INTO item_table VALUES(2,"アドニスブルーの瞳","book",500,6);
	INSERT INTO item_table VALUES(3,"ScarletCode","book",1500,12);
	INSERT INTO item_table VALUES(4,"MaximumFear","book",1000,2);
	INSERT INTO item_table VALUES(5,"Ogre","game",1500,5);
	INSERT INTO item_table VALUES(6,"DarkBlue","game",1000,7);
	INSERT INTO item_table VALUES(7,"青い影","book",500,3);


drop table if exists user_item_transaction;

create table user_item_transaction(
	user_account_id varchar(30),
	user_pass varchar(30),

	transaction_number int not null primary key auto_increment,
	total_price int,
	total_buy_count int,
	pay nvarchar(30)
);

	INSERT INTO user_item_transaction VALUES("phantom_production","phantom225",1,1500,2,"現金払い");


