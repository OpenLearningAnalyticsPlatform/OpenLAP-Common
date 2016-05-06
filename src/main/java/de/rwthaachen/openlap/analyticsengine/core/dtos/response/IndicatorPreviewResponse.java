package de.rwthaachen.openlap.analyticsengine.core.dtos.response;

import DataSet.OLAPPortConfiguration;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Arham Muslim
 * on 06-May-16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class IndicatorPreviewResponse {

    private String visualizationCode;
    private String query;
    private long analyticsMethodId;
    private long visualizationFrameworkId;
    private long visualizationMethodId;
    OLAPPortConfiguration indicatorToAnalyticsMethodMapping;
    OLAPPortConfiguration analyticsMethodToVisualizationMapping;
    private boolean isSuccess;
    private String errorMessage;

    public String getVisualizationCode() {
        return visualizationCode;
    }

    public void setVisualizationCode(String visualizationCode) {
        this.visualizationCode = visualizationCode;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public long getAnalyticsMethodId() {
        return analyticsMethodId;
    }

    public void setAnalyticsMethodId(long analyticsMethodId) {
        this.analyticsMethodId = analyticsMethodId;
    }

    public long getVisualizationFrameworkId() {
        return visualizationFrameworkId;
    }

    public void setVisualizationFrameworkId(long visualizationFrameworkId) {
        this.visualizationFrameworkId = visualizationFrameworkId;
    }

    public long getVisualizationMethodId() {
        return visualizationMethodId;
    }

    public void setVisualizationMethodId(long visualizationMethodId) {
        this.visualizationMethodId = visualizationMethodId;
    }

    public OLAPPortConfiguration getIndicatorToAnalyticsMethodMapping() {
        return indicatorToAnalyticsMethodMapping;
    }

    public void setIndicatorToAnalyticsMethodMapping(OLAPPortConfiguration indicatorToAnalyticsMethodMapping) {
        this.indicatorToAnalyticsMethodMapping = indicatorToAnalyticsMethodMapping;
    }

    public OLAPPortConfiguration getAnalyticsMethodToVisualizationMapping() {
        return analyticsMethodToVisualizationMapping;
    }

    public void setAnalyticsMethodToVisualizationMapping(OLAPPortConfiguration analyticsMethodToVisualizationMapping) {
        this.analyticsMethodToVisualizationMapping = analyticsMethodToVisualizationMapping;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }
}
