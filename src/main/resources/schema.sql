create table car(
	id bigint not null,
	model varchar(255),
	color varchar(255),
	driver_id bigint,
	year_column int
);

create table driver(
	id bigint not null,
	name varchar(255),
	surname varchar(255),
	phone varchar(255),
	address varchar(255)
);

create table carWash(
	id bigint not null,
	price bigint,
	date Date,
	car_id bigint
);



alter table car add constraint constraint1 primary key(id);
alter table driver add constraint constraint2 primary key(id);
alter table car add constraint constraint3 foreign key(driver_id) references driver;
alter table carWash add constraint constraint5 foreign key(car_id) references car;
