create table if not exists Contract (
  id varchar(4) not null,
  name varchar(255) not null,
  startdate date not null,
  enddate date not null,
  cost decimal(10, 2) not null,
  PRIMARY KEY (id)
); 
