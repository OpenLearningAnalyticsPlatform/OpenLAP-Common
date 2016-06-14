package de.rwthaachen.openlap.analyticsengine.core.dtos.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Arham Muslim
 * on 14-Jun-16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class IndicatorSaveResponse {
    private boolean isIndicatorSaved;
    private String errorMessage;

    private int indicatorClientID;
    private String indicatorRequestCode;

    public boolean isIndicatorSaved() {
        return isIndicatorSaved;
    }

    public void setIndicatorSaved(boolean indicatorSaved) {
        isIndicatorSaved = indicatorSaved;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public int getIndicatorClientID() {
        return indicatorClientID;
    }

    public void setIndicatorClientID(int indicatorClientID) {
        this.indicatorClientID = indicatorClientID;
    }

    public String getIndicatorRequestCode() {
        return indicatorRequestCode;
    }

    public void setIndicatorRequestCode(String indicatorRequestCode) {
        this.indicatorRequestCode = indicatorRequestCode;
    }
}
