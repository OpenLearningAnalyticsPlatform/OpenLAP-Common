package de.rwthaachen.openlap.analyticsengine.core.dtos.response;

import de.rwthaachen.openlap.analyticsmodules.model.AnalyticsMethodEntry;
import de.rwthaachen.openlap.analyticsmodules.model.IndicatorReference;
import de.rwthaachen.openlap.analyticsmodules.model.VisualizerReference;
import de.rwthaachen.openlap.dataset.OpenLAPPortConfig;

/**
 * Created by Arham Muslim
 * on 16-Jun-16.
 */
public class IndicatorResponse {
    private long id;
    private String query;
    private IndicatorReference indicatorReference;
    private AnalyticsMethodEntry analyticsMethodReference;
    private VisualizerReference visualizationReference;
    private OpenLAPPortConfig queryToMethodConfig;
    private OpenLAPPortConfig methodToVisualizationConfig;
    private String name;
    private String parameters;
    private boolean isComposite;
    private String createdBy;

    public IndicatorResponse() {
    }

    public IndicatorResponse(long id, String query, IndicatorReference indicatorReference,
                             AnalyticsMethodEntry analyticsMethodReference,
                             VisualizerReference visualizationReference,
                             OpenLAPPortConfig queryToMethodConfig,
                             OpenLAPPortConfig methodToVisualizationConfig,
                             String name, String parameters, boolean isComposite, String createdBy) {
        this.id = id;
        this.query = query;
        this.indicatorReference = indicatorReference;
        this.analyticsMethodReference = analyticsMethodReference;
        this.visualizationReference = visualizationReference;
        this.queryToMethodConfig = queryToMethodConfig;
        this.methodToVisualizationConfig = methodToVisualizationConfig;
        this.name = name;
        this.parameters = parameters;
        this.isComposite = isComposite;
        this.createdBy = createdBy;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public IndicatorReference getIndicatorReference() {
        return indicatorReference;
    }

    public void setIndicatorReference(IndicatorReference indicatorReference) {
        this.indicatorReference = indicatorReference;
    }

    public AnalyticsMethodEntry getAnalyticsMethodReference() {
        return analyticsMethodReference;
    }

    public void setAnalyticsMethodReference(AnalyticsMethodEntry analyticsMethodReference) {
        this.analyticsMethodReference = analyticsMethodReference;
    }

    public VisualizerReference getVisualizationReference() {
        return visualizationReference;
    }

    public void setVisualizationReference(VisualizerReference visualizationReference) {
        this.visualizationReference = visualizationReference;
    }

    public OpenLAPPortConfig getQueryToMethodConfig() {
        return queryToMethodConfig;
    }

    public void setQueryToMethodConfig(OpenLAPPortConfig queryToMethodConfig) {
        this.queryToMethodConfig = queryToMethodConfig;
    }

    public OpenLAPPortConfig getMethodToVisualizationConfig() {
        return methodToVisualizationConfig;
    }

    public void setMethodToVisualizationConfig(OpenLAPPortConfig methodToVisualizationConfig) {
        this.methodToVisualizationConfig = methodToVisualizationConfig;
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
