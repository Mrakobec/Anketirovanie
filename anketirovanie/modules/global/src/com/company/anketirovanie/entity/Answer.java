package com.company.anketirovanie.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|answer")
@Table(name = "ANKETIROVANIE_ANSWER")
@Entity(name = "anketirovanie$Answer")
public class Answer extends StandardEntity {
    private static final long serialVersionUID = 5935880368348828852L;

    @NotNull
    @Column(name = "ANSWER", nullable = false, unique = true)
    protected String answer;


    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }


}