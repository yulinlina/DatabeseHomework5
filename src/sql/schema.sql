create table team_member
(
    stu_number varchar(20) not null
        constraint stu_number_ky
            primary key,
    name       varchar(20) not null,
    birthday   date        not null,
    hobby      varchar(30) not null
);