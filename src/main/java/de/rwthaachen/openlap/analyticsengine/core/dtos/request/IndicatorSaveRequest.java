package de.rwthaachen.openlap.analyticsengine.core.dtos.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Arham Muslim
 * on 09-Jun-16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class IndicatorSaveRequest extends IndicatorPreviewRequest {
    /**
     * Name of the indicator
     */
    private String name;

    /**
     * Complete object of the indicators in JSON format this stores all the parameters of the current indicator
     * This field will be available when loading of existing indicators needs to be performed
     */
    private String parameters;

    /**
     * Is indicators of composite type
     */
    private boolean isComposite;

    /**
     * Name of the person who created the indicators
     */
    private String createdBy;

    /**
     * Unique id of the indicator on the client side which will be used to send back the request code.
     * E.g. index of the indicators in the list can act as the indicatorClientID
     */
    private int indicatorClientID;

    /**
     * If an existing indicators is loaded and updated than the id of the indicator will be set here.
     */
    private long serverID;

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

    public long getServerID() {
        return serverID;
    }

    public void setServerID(long serverID) {
        this.serverID = serverID;
    }
}
