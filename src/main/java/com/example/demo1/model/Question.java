package com.example.demo1.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="questions")
public class Question implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    int id;
	
	@Column(name = "Options1")
    String option1;
	@Column(name = "Options2")
    String option2;
	@Column(name = "Options3")
    String option3;
	@Column(name = "Options4")
    String option4;
	@Column(name = "questionsDecs")
    String questionDesc;
	@Column(name = "correctAns")
    String correctAns;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorrectAns() {
        return correctAns;
    }

    public void setCorrectAns(String correctAns) {
        this.correctAns = correctAns;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public String getQuestionDesc() {
        return questionDesc;
    }

    public void setQuestionDesc(String questionDesc) {
        this.questionDesc = questionDesc;
    }

    @Override
    public String toString() {
        return "Question{" +
                "option1='" + option1 + '\'' +
                ", option2='" + option2 + '\'' +
                ", option3='" + option3 + '\'' +
                ", option4='" + option4 + '\'' +
                ", questionDesc='" + questionDesc + '\'' +
                ", correctAns='" + correctAns + '\'' +
                '}';
    }
}
