package de.rwthaachen.openlap.analyticsengine.core.dtos.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Arham Muslim
 * on 09-Jun-16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class IndicatorSaveRequest extends IndicatorPreviewRequest {
    private String name;
    private String parameters;
    private boolean isComposite;
    private String createdBy;
    private int indicatorClientID;

    public int getIndicatorClientID() {
        return indicatorClientID;
    }

    public void setIndicatorClientID(int indicatorClientID) {
        this.indicatorClientID = indicatorClientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public boolean isComposite() {
        return isComposite;
    }

    public void setComposite(boolean composite) {
        isComposite = composite;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
