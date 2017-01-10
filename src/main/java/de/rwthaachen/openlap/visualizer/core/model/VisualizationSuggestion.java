package de.rwthaachen.openlap.visualizer.core.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * Model class representing the metadata of a Visualization Suggestion
 *
 * @author Bassim Bashir
 */
@Entity
@Table(name = "VIS_SUGGESTIONS")
@JsonIgnoreProperties(ignoreUnknown = true)
public class VisualizationSuggestion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "VIS_SUGGESTION_ID")
    private long id;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "VIS_METHOD_FID")
    private VisualizationMethod visualizationMethod;
    @Column(name = "INPUT_COLUMN_CONFIG")
    private String OpenLAPDataSetConfiguration;

    public VisualizationSuggestion(){

    }

    public VisualizationSuggestion(VisualizationMethod visMethod, String OpenLAPDataSetConfiguration){
        this.visualizationMethod = visMethod;
        this.OpenLAPDataSetConfiguration = OpenLAPDataSetConfiguration;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public VisualizationMethod getVisualizationMethod() {
        return visualizationMethod;
    }

    public void setVisualizationMethod(VisualizationMethod visualizationMethod) {
        this.visualizationMethod = visualizationMethod;
    }

    public String getOpenLAPDataSetConfiguration() {
        return OpenLAPDataSetConfiguration;
    }

    public void setOpenLAPDataSetConfiguration(String OpenLAPDataSetConfiguration) {
        this.OpenLAPDataSetConfiguration = OpenLAPDataSetConfiguration;
    }
}
