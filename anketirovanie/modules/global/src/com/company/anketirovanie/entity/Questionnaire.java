package com.company.anketirovanie.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|questionnaire")
@Table(name = "ANKETIROVANIE_QUESTIONNAIRE")
@Entity(name = "anketirovanie$Questionnaire")
public class Questionnaire extends StandardEntity {
    private static final long serialVersionUID = 4962496464394945485L;

    @NotNull
    @Column(name = "QUESTIONNAIRE", nullable = false, unique = true)
    protected String questionnaire;

    @JoinTable(name = "ANKETIROVANIE_QUESTIONNAIRE_QUESTION_LINK",
        joinColumns = @JoinColumn(name = "QUESTIONNAIRE_ID"),
        inverseJoinColumns = @JoinColumn(name = "QUESTION_ID"))
    @ManyToMany
    protected List<Question> question;

    public void setQuestionnaire(String questionnaire) {
        this.questionnaire = questionnaire;
    }

    public String getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestion(List<Question> question) {
        this.question = question;
    }

    public List<Question> getQuestion() {
        return question;
    }


}