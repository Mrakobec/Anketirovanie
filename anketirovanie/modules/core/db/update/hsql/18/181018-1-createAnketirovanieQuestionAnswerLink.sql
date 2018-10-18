create table ANKETIROVANIE_QUESTION_ANSWER_LINK (
    QUESTION_ID varchar(36) not null,
    ANSWER_ID varchar(36) not null,
    primary key (QUESTION_ID, ANSWER_ID)
);
