package com.company.anketirovanie.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|question")
@Table(name = "ANKETIROVANIE_QUESTION")
@Entity(name = "anketirovanie$Question")
public class Question extends StandardEntity {
    private static final long serialVersionUID = 3368942930598307363L;

    @NotNull
    @Column(name = "QUESTION", nullable = false, unique = true)
    protected String question;

    @NotNull
    @Column(name = "QUTYPE", nullable = false)
    protected Integer qutype;

    @JoinTable(name = "ANKETIROVANIE_QUESTION_ANSWER_LINK",
        joinColumns = @JoinColumn(name = "QUESTION_ID"),
        inverseJoinColumns = @JoinColumn(name = "ANSWER_ID"))
    @ManyToMany
    protected List<Answer> answer;

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public void setQutype(QuType qutype) {
        this.qutype = qutype == null ? null : qutype.getId();
    }

    public QuType getQutype() {
        return qutype == null ? null : QuType.fromId(qutype);
    }


    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }

    public List<Answer> getAnswer() {
        return answer;
    }


}