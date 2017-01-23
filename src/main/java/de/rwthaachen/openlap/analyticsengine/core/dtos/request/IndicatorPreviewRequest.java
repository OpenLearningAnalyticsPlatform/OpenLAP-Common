package de.rwthaachen.openlap.analyticsengine.core.dtos.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import de.rwthaachen.openlap.analyticsmodules.model.OpenLAPDataSetMergeMapping;
import de.rwthaachen.openlap.dataset.OpenLAPPortConfig;

import java.util.*;

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
    private Map<String, OpenLAPPortConfig> queryToMethodConfig;
    private OpenLAPPortConfig methodToVisualizationConfig;
    private Map<String, String> methodInputParams;
    private Map<String, String> visualizationInputParams;
    private Map<String, Object> additionalParams;
    private boolean isComposite;
    List<OpenLAPDataSetMergeMapping> dataSetMergeMappingList;

    public IndicatorPreviewRequest(){
        query = new HashMap<String, String>();
        analyticsMethodId = new HashMap<String, Long>();
        queryToMethodConfig = new HashMap<String, OpenLAPPortConfig>();
        dataSetMergeMappingList = new ArrayList<OpenLAPDataSetMergeMapping>();
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

    public Map<String, OpenLAPPortConfig> getQueryToMethodConfig() {
        return queryToMethodConfig;
    }

    public void setQueryToMethodConfig(Map<String, OpenLAPPortConfig> queryToMethodConfig) {
        this.queryToMethodConfig = queryToMethodConfig;
    }

    public OpenLAPPortConfig getMethodToVisualizationConfig() {
        return methodToVisualizationConfig;
    }

    public void setMethodToVisualizationConfig(OpenLAPPortConfig methodToVisualizationConfig) {
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

    public List<OpenLAPDataSetMergeMapping> getDataSetMergeMappingList() {
        return dataSetMergeMappingList;
    }

    public void setDataSetMergeMappingList(List<OpenLAPDataSetMergeMapping> dataSetMergeMappingList) {
        this.dataSetMergeMappingList = dataSetMergeMappingList;
    }
}
