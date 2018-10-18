-- begin ANKETIROVANIE_ANSWER
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
)^
-- end ANKETIROVANIE_ANSWER
-- begin ANKETIROVANIE_QUESTION
create table ANKETIROVANIE_QUESTION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    QUESTION varchar(255) not null,
    QUTYPE integer not null,
    --
    primary key (ID)
)^
-- end ANKETIROVANIE_QUESTION
-- begin ANKETIROVANIE_QUESTIONNAIRE
create table ANKETIROVANIE_QUESTIONNAIRE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    QUESTIONNAIRE varchar(255) not null,
    --
    primary key (ID)
)^
-- end ANKETIROVANIE_QUESTIONNAIRE
-- begin ANKETIROVANIE_QUESTION_ANSWER_LINK
create table ANKETIROVANIE_QUESTION_ANSWER_LINK (
    QUESTION_ID varchar(36) not null,
    ANSWER_ID varchar(36) not null,
    primary key (QUESTION_ID, ANSWER_ID)
)^
-- end ANKETIROVANIE_QUESTION_ANSWER_LINK
-- begin ANKETIROVANIE_QUESTIONNAIRE_QUESTION_LINK
create table ANKETIROVANIE_QUESTIONNAIRE_QUESTION_LINK (
    QUESTIONNAIRE_ID varchar(36) not null,
    QUESTION_ID varchar(36) not null,
    primary key (QUESTIONNAIRE_ID, QUESTION_ID)
)^
-- end ANKETIROVANIE_QUESTIONNAIRE_QUESTION_LINK
