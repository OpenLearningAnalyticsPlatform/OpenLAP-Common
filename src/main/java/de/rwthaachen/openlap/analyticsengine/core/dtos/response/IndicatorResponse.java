package de.rwthaachen.openlap.analyticsengine.core.dtos.response;

import DataSet.OLAPPortConfiguration;
import de.rwthaachen.openlap.analyticsmethods.model.AnalyticsMethodMetadata;
import de.rwthaachen.openlap.analyticsmodules.model.IndicatorReference;
import de.rwthaachen.openlap.analyticsmodules.model.VisualizerReference;

/**
 * Created by Arham Muslim
 * on 16-Jun-16.
 */
public class IndicatorResponse {
    private long id;
    private String query;
    private IndicatorReference indicatorReference;
    private AnalyticsMethodMetadata analyticsMethodReference;
    private VisualizerReference visualizationReference;
    private OLAPPortConfiguration queryToMethodConfig;
    private OLAPPortConfiguration methodToVisualizationConfig;
    private String name;
    private String parameters;
    private boolean isComposite;
    private String createdBy;

    public IndicatorResponse() {
    }

    public IndicatorResponse(long id, String query, IndicatorReference indicatorReference,
                             AnalyticsMethodMetadata analyticsMethodReference,
                             VisualizerReference visualizationReference,
                             OLAPPortConfiguration queryToMethodConfig,
                             OLAPPortConfiguration methodToVisualizationConfig,
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

    public AnalyticsMethodMetadata getAnalyticsMethodReference() {
        return analyticsMethodReference;
    }

    public void setAnalyticsMethodReference(AnalyticsMethodMetadata analyticsMethodReference) {
        this.analyticsMethodReference = analyticsMethodReference;
    }

    public VisualizerReference getVisualizationReference() {
        return visualizationReference;
    }

    public void setVisualizationReference(VisualizerReference visualizationReference) {
        this.visualizationReference = visualizationReference;
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
