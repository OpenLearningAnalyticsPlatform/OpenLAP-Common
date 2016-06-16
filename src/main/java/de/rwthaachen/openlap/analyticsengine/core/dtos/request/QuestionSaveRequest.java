package de.rwthaachen.openlap.analyticsengine.core.dtos.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by Arham Muslim
 * on 09-Jun-16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuestionSaveRequest {
    /**
     * Name of the question
     */
    private String question;

    /**
     * Id of the associated goal
     */
    private long goalID;

    /**
     * List of all the indicators associated with this question
     */
    private List<IndicatorSaveRequest> indicators;

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

    public List<IndicatorSaveRequest> getIndicators() {
        return indicators;
    }

    public void setIndicators(List<IndicatorSaveRequest> indicators) {
        this.indicators = indicators;
    }
}
