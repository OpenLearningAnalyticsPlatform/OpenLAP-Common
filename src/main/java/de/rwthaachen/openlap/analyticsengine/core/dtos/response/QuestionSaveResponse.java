package de.rwthaachen.openlap.analyticsengine.core.dtos.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by Arham Muslim
 * on 09-Jun-16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuestionSaveResponse {
    private boolean isQuestionSaved;
    private String errorMessage;

    private List<IndicatorSaveResponse> indicatorSaveResponses;

    public boolean isQuestionSaved() {
        return isQuestionSaved;
    }

    public void setQuestionSaved(boolean questionSaved) {
        isQuestionSaved = questionSaved;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public List<IndicatorSaveResponse> getIndicatorSaveResponses() {
        return indicatorSaveResponses;
    }

    public void setIndicatorSaveResponses(List<IndicatorSaveResponse> indicatorSaveResponses) {
        this.indicatorSaveResponses = indicatorSaveResponses;
    }
}

