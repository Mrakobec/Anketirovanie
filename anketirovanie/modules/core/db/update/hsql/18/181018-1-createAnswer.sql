create table ANKETIROVANIE_ANSWER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ANSWER varchar(255) not null,
    TRUE_FALSE integer,
    --
    primary key (ID)
);