package de.rwthaachen.openlap.analyticsengine.core.dtos.response;

import de.rwthaachen.openlap.analyticsmodules.model.*;
import de.rwthaachen.openlap.dataset.OpenLAPPortConfig;

import java.util.List;
import java.util.Map;

/**
 * Created by Arham Muslim
 * on 16-Jun-16.
 */
public class IndicatorResponse {
    private long id;
    private String name;
    private Map<String, String> query;
    private IndicatorReference indicatorReference;
    private AnalyticsMethodReference analyticsMethodReference;
    private VisualizerReference visualizationReference;
    private Map<String, OpenLAPPortConfig> queryToMethodConfig;
    private OpenLAPPortConfig methodToVisualizationConfig;

    private Map<String, String> methodInputParams;
    private Map<String, String> visualizationInputParams;
    private Map<String, Object> additionalParams;

    List<OpenLAPDataSetMergeMapping> dataSetMergeMappingList;

    private String parameters;
    private String indicatorType;
    private String createdBy;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getQuery() {
        return query;
    }

    public void setQuery(Map<String, String> query) {
        this.query = query;
    }

    public IndicatorReference getIndicatorReference() {
        return indicatorReference;
    }

    public void setIndicatorReference(IndicatorReference indicatorReference) {
        this.indicatorReference = indicatorReference;
    }

    public AnalyticsMethodReference getAnalyticsMethodReference() {
        return analyticsMethodReference;
    }

    public void setAnalyticsMethodReference(AnalyticsMethodReference analyticsMethodReference) {
        this.analyticsMethodReference = analyticsMethodReference;
    }

    public VisualizerReference getVisualizationReference() {
        return visualizationReference;
    }

    public void setVisualizationReference(VisualizerReference visualizationReference) {
        this.visualizationReference = visualizationReference;
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

    public Map<String, Object> getAdditionalParams() {
        return additionalParams;
    }

    public void setAdditionalParams(Map<String, Object> additionalParams) {
        this.additionalParams = additionalParams;
    }

    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public String getIndicatorType() {
        return indicatorType;
    }

    public void setIndicatorType(String indicatorType) {
        this.indicatorType = indicatorType;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public List<OpenLAPDataSetMergeMapping> getDataSetMergeMappingList() {
        return dataSetMergeMappingList;
    }

    public void setDataSetMergeMappingList(List<OpenLAPDataSetMergeMapping> dataSetMergeMappingList) {
        this.dataSetMergeMappingList = dataSetMergeMappingList;
    }
}
