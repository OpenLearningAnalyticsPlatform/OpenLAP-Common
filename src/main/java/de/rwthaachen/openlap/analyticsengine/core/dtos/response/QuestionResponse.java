package de.rwthaachen.openlap.analyticsengine.core.dtos.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Arham Muslim
 * on 16-Jun-16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuestionResponse {

    private String question;
    private long goalID;
    private int indicatorCount;

    public QuestionResponse() {
    }

    public QuestionResponse(String question, long goalID, int indicatorCount) {
        this.question = question;
        this.goalID = goalID;
        this.indicatorCount = indicatorCount;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public long getGoalID() {
        return goalID;
    }

    public void setGoalID(long goalID) {
        this.goalID = goalID;
    }

    public int getIndicatorCount() {
        return indicatorCount;
    }

    public void setIndicatorCount(int indicatorCount) {
        this.indicatorCount = indicatorCount;
    }
}
