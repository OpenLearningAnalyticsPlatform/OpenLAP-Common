package de.rwthaachen.openlap.analyticsengine.core.dtos.request;

import DataSet.OLAPPortConfiguration;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Arham Muslim
 * on 06-May-16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class IndicatorPreviewRequest {
    private String query;
    private long analyticsMethodId;
    private long visualizationFrameworkId;
    private long visualizationMethodId;
    private OLAPPortConfiguration queryToMethodConfig;
    private OLAPPortConfiguration methodToVisualizationConfig;

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

    public OLAPPortConfiguration getQueryToMethodConfig() {
        return queryToMethodConfig;
    }

    public void setQueryToMethodConfig(OLAPPortConfiguration queryToMethodConfig) {
        this.queryToMethodConfig = queryToMethodConfig;
    }

    public OLAPPortConfiguration getMethodToVisualizationConfig() {
        return methodToVisualizationConfig;
    }

    public void setMethodToVisualizationConfig(OLAPPortConfiguration methodToVisualizationConfig) {
        this.methodToVisualizationConfig = methodToVisualizationConfig;
    }
}
