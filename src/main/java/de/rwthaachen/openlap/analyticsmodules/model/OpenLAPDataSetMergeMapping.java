package de.rwthaachen.openlap.analyticsmodules.model;

/**
 * Created by Arham Muslim
 * on 23-Jan-17.
 */
public class OpenLAPDataSetMergeMapping {
    private String indReferenceKey1;
    private String indReferenceKey2;
    private String commonField;

    public OpenLAPDataSetMergeMapping(String indReferenceKey1, String indReferenceKey2, String commonField) {
        this.indReferenceKey1 = indReferenceKey1;
        this.indReferenceKey2 = indReferenceKey2;
        this.commonField = commonField;
    }

    public String getIndReferenceKey1() {
        return indReferenceKey1;
    }

    public void setIndReferenceKey1(String indReferenceKey1) {
        this.indReferenceKey1 = indReferenceKey1;
    }

    public String getIndReferenceKey2() {
        return indReferenceKey2;
    }

    public void setIndReferenceKey2(String indReferenceKey2) {
        this.indReferenceKey2 = indReferenceKey2;
    }

    public String getCommonField() {
        return commonField;
    }

    public void setCommonField(String commonField) {
        this.commonField = commonField;
    }
}
