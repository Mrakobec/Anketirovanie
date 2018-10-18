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

    @Column(name = "TRUE_FALSE")
    protected Integer true_false;

    public void setTrue_false(True_false true_false) {
        this.true_false = true_false == null ? null : true_false.getId();
    }

    public True_false getTrue_false() {
        return true_false == null ? null : True_false.fromId(true_false);
    }


    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }


}