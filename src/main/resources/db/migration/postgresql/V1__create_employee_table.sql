create sequence emp_id_seq start with 1 increment by 50;

create table employee (
    id smallint default nextval('emp_id_seq') not null,
    first_name varchar(255) not null,
    age  int not null,
    primary key (id)
);

alter table if exists employee add constraint unique_constraint_name unique (first_name);
