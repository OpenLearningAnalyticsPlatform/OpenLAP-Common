package de.rwthaachen.openlap.analyticsengine.core.dtos.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Arham Muslim
 * on 16-Jun-16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuestionResponse {

    private long id;
    private String name;
    private int indicatorCount;

    public QuestionResponse() {
    }

    public QuestionResponse(long id, String name, int indicatorCount) {
        this.name = name;
        this.id = id;
        this.indicatorCount = indicatorCount;
    }

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

    public int getIndicatorCount() {
        return indicatorCount;
    }

    public void setIndicatorCount(int indicatorCount) {
        this.indicatorCount = indicatorCount;
    }
}
