package de.rwthaachen.openlap.analyticsengine.core.dtos.request;

import DataSet.OLAPPortConfiguration;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Arham Muslim
 * on 06-May-16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class IndicatorPreviewRequest {

    private Map<String, String> query;
    private Map<String, Long> analyticsMethodId;
    private long visualizationFrameworkId;
    private long visualizationMethodId;
    private Map<String, OLAPPortConfiguration> queryToMethodConfig;
    private OLAPPortConfiguration methodToVisualizationConfig;
    private Map<String, String> methodInputParams;
    private Map<String, String> visualizationInputParams;
    private Map<String, Object> additionalParams;
    private boolean isComposite;

    public IndicatorPreviewRequest(){
        query = new HashMap<String, String>();
        analyticsMethodId = new HashMap<String, Long>();
        queryToMethodConfig = new HashMap<String, OLAPPortConfiguration>();
    }

    public Map<String, String> getQuery() {
        return query;
    }

    public void setQuery(Map<String, String> query) {
        this.query = query;
    }

    public Map<String, Long> getAnalyticsMethodId() {
        return analyticsMethodId;
    }

    public void setAnalyticsMethodId(Map<String, Long> analyticsMethodId) {
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

    public Map<String, OLAPPortConfiguration> getQueryToMethodConfig() {
        return queryToMethodConfig;
    }

    public void setQueryToMethodConfig(Map<String, OLAPPortConfiguration> queryToMethodConfig) {
        this.queryToMethodConfig = queryToMethodConfig;
    }

    public OLAPPortConfiguration getMethodToVisualizationConfig() {
        return methodToVisualizationConfig;
    }

    public void setMethodToVisualizationConfig(OLAPPortConfiguration methodToVisualizationConfig) {
        this.methodToVisualizationConfig = methodToVisualizationConfig;
    }

    public Map<String, Object> getAdditionalParams() {
        return additionalParams;
    }

    public void setAdditionalParams(Map<String, Object> additionalParams) {
        this.additionalParams = additionalParams;
    }

    public boolean isComposite() {
        return isComposite;
    }

    public void setComposite(boolean composite) {
        isComposite = composite;
    }

    public Map<String, String> getMethodInputParams() {
        return methodInputParams;
    }

    public void setMethodInputParams(Map<String, String> methodInputParams) {
        this.methodInputParams = methodInputParams;
    }

    public Map<String, String> getVisualizationInputParams() {
        return visualizationInputParams;
    }

    public void setVisualizationInputParams(Map<String, String> visualizationInputParams) {
        this.visualizationInputParams = visualizationInputParams;
    }
}
