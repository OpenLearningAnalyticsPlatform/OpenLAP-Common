package de.rwthaachen.openlap.visualizer.core.dtos.request;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import de.rwthaachen.openlap.dataset.OpenLAPDataSet;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddNewVisualizationSuggestionRequest {
    private Long visualizationMethodId;
    private OpenLAPDataSet openLAPDataSet;

    public Long getVisualizationMethodId() {
        return visualizationMethodId;
    }

    public void setVisualizationMethodId(Long visualizationMethodId) {
        this.visualizationMethodId = visualizationMethodId;
    }

    public OpenLAPDataSet getOpenLAPDataSet() {
        return openLAPDataSet;
    }

    public void setOpenLAPDataSet(OpenLAPDataSet openLAPDataSet) {
        this.openLAPDataSet = openLAPDataSet;
    }
}
