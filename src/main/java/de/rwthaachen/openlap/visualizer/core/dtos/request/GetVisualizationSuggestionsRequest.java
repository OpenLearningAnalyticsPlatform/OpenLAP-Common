package de.rwthaachen.openlap.visualizer.core.dtos.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import de.rwthaachen.openlap.dataset.OpenLAPDataSet;
import de.rwthaachen.openlap.dataset.OpenLAPPortConfig;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetVisualizationSuggestionsRequest {

    private OpenLAPPortConfig openLAPPortConfig;
    private OpenLAPDataSet dataSetConfiguration;

    public OpenLAPPortConfig getOpenLAPPortConfig() {
        return openLAPPortConfig;
    }

    public void setOpenLAPPortConfig(OpenLAPPortConfig openLAPPortConfig) {
        this.openLAPPortConfig = openLAPPortConfig;
    }

    public OpenLAPDataSet getDataSetConfiguration() {
        return dataSetConfiguration;
    }

    public void setDataSetConfiguration(OpenLAPDataSet dataSetConfiguration) {
        this.dataSetConfiguration = dataSetConfiguration;
    }
}
