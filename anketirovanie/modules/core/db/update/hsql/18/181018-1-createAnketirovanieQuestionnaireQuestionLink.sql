create table ANKETIROVANIE_QUESTIONNAIRE_QUESTION_LINK (
    QUESTIONNAIRE_ID varchar(36) not null,
    QUESTION_ID varchar(36) not null,
    primary key (QUESTIONNAIRE_ID, QUESTION_ID)
);
